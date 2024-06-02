package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.allCars(count));
        return "cars";
    }
}
