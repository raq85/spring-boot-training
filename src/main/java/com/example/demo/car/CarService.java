package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService{

    @Autowired
    CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public List<Car> getCarsByColor(String color) {
        return carRepository.findAllByColor(color);
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }
}
