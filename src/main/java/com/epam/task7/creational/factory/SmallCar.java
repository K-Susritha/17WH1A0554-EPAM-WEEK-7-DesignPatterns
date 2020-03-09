package com.epam.task7.creational.factory;

public class SmallCar extends Car {
	 
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }
 
    protected void construct() {
        System.out.println("Building small car");
    }
}
