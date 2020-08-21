package com.example.demo;

import com.example.demo.car.Car;
import com.example.demo.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	CarService carService;

	@EventListener(ApplicationReadyEvent.class)
	public void addCarsAtStartup(){

		carService.addCar(new Car("Brand1", "Model1", "red" ));
		carService.addCar(new Car("Brand2", "Model2", "blue" ));
		carService.addCar(new Car("Brand3", "Model3", "yellow" ));
		carService.addCar(new Car("Brand4", "Model4", "green" ));
		carService.addCar(new Car("Brand5", "Model5", "black" ));
		carService.addCar(new Car("Brand6", "Model6", "white" ));
		carService.addCar(new Car("Brand7", "Model7", "gold" ));
		carService.addCar(new Car("Brand8", "Model8", "silver" ));
		carService.addCar(new Car("Brand9", "Model9", "pink" ));
		carService.addCar(new Car("Brand10", "Model10", "brown" ));
	}
}
