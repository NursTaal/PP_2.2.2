package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;
import web.service.CarsServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

   final CarsServiceImpl carsService;

    public CarsController(CarsServiceImpl carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String car(@RequestParam(defaultValue = "0") String count , Model model ){
        carsService.saveCar(1,"Tesla","white",100);
        carsService.saveCar(2,"Mazda","red",202);
        carsService.saveCar(3,"BMW","purple",345);
        carsService.saveCar(4,"Volkswagen","blue",485);
        carsService.saveCar(5,"Toyota","black",510);
        carsService.saveCar(6,"Lamborghini","green",662);
        carsService.saveCar(7,"subaru","golden",736);

        model.addAttribute("allcars", carsService.getAllCars(count));
        return "cars";
    }

}
