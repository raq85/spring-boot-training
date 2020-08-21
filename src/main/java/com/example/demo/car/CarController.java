package com.example.demo.car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping()
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{color}")
    public List<Car> getCarsByColor(@PathVariable String color) {
        return carService.getCarsByColor(color);
    }


    @PostMapping("")
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

}
