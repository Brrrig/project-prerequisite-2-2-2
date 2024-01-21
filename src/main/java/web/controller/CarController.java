package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.services.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String allCars(Model model) {
        model.addAttribute("cars", carService.showCountCars(5));
        return "cars";
    }

    @GetMapping("/cars&count={count}")
    public String showCountCars(@PathVariable("count") int count, Model model) {
        model.addAttribute("cars", carService.showCountCars(count));
        return "cars";
    }
}
