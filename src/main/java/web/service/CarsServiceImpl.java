package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarsDAO;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServiceImpl implements CarsService {

    final CarsDAO carsDAO;

    @Autowired
    public CarsServiceImpl(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @Override
    public void saveCar(int id, String model, String colour, int series) {
        carsDAO.saveCar(id, model, colour, series);
    }

    @Override
    public List<Cars> getAllCars(String count1) {
        int count = Integer.parseInt(count1);
        if (count > 5 || count == 0) {
            return carsDAO.getAllCars();
        } else {
                return carsDAO.getAllCars().stream().limit(count).collect(Collectors.toList());
        }
    }

}
