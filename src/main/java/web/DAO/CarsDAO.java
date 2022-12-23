package web.DAO;

import web.model.Cars;

import java.util.List;

public interface CarsDAO {
    void saveCar(int id,String model, String colour, int series);
    List<Cars> getAllCars();

}
