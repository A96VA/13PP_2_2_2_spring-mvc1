package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.Car;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String countCars(@RequestParam(name = "count", defaultValue = "10") int count, Model model){
        model.addAttribute("listCars", carService.countCars(count));
        return "cars";
    }
    @GetMapping("/new")
    public String newCar(Model model){
        model.addAttribute("car", new Car());
        return "new";
    }
//    @PostMapping()
//    public String create (@ModelAttribute("car") Car car){
//        carService.save(car);
//        return "redirect:/cars";
//    }


    @PostMapping()
    public String create (@RequestParam("gosNomer") String gosNomer,
                          @RequestParam("brand") String brand,
                          @RequestParam("color") String color){
        Car car = new Car();
        car.setGosNomer(gosNomer);
        car.setBrand(brand);
        car.setColor(color);
        carService.save(car);

        return "redirect:/cars";
    }


}
