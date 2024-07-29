package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(name="count", defaultValue = "5", required = false) int count, Model model) {
        model.addAttribute("cars", new CarService().getCars().stream().limit(count).toList());
        return "cars";
    }
}
