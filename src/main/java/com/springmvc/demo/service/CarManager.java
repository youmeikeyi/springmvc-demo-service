package com.springmvc.demo.service;

import com.springmvc.demo.model.Brand;
import com.springmvc.demo.model.Car;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class CarManager {
 
	private List<Car> carList;

	/*
	we now use a single instance of CarManager for our whole application,
	we don't need its carList attribute to be static anymore:
	private static List<Car> carList;
	static {
		...
	}*/
	public CarManager() {
		/*Brand brand1 = new Brand();
		brand1.setId((long)1);
		brand1.setName("Mercedes");
		brand1.setCountry("Germany");		
 
		Brand brand2 = new Brand();
		brand2.setId((long)2);
		brand2.setName("Peugeot");
		brand2.setCountry("France");		
 
		Car car1 = new Car();
		car1.setId((long)1);
		car1.setBrand(brand1);
		car1.setModel("SL 500");
		car1.setPrice(new BigDecimal(40000));
 
		Car car2 = new Car();
		car2.setId((long)2);
		car2.setBrand(brand2);
		car2.setModel("607");
		car2.setPrice(new BigDecimal(35000));
 
		carList = new LinkedList<Car>();
		carList.add(car1);
		carList.add(car2);		*/
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public Car createCar(Car c) {
		Car car = new Car();
		car.setId((long)carList.size() + 1);
		car.setBrand(c.getBrand());
		car.setModel(c.getModel());
		car.setPrice(c.getPrice());

		carList.add(car);

		return car;
	}
}