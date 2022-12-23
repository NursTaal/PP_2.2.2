package web.service;

import web.model.Cars;

import java.util.List;

public interface CarsService {
    void saveCar(int id,String model, String colour, int series);
    List<Cars> getAllCars(String count);
}
