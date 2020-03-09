package com.epam.task7.creational.factory;

public class SUVCar extends Car {
	 
	SUVCar() {
        super(CarType.SUV);
        construct();
    }

    protected void construct() {
        System.out.println("Building SUV car");
    }
}