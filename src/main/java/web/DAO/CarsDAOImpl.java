package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAOImpl implements CarsDAO {
    List<Cars> carsList = new ArrayList<>();

    @Override
    public void saveCar(int id,String model, String colour, int series) {
        carsList.add(new Cars(id,model,colour,series));
    }

    @Override
    public List<Cars> getAllCars() {
        return carsList;
    }

}
