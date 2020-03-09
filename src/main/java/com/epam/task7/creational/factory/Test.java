package com.epam.task7.creational.factory;

public class Test {
    public static void main( String[] args ) {
        System.out.println(FactoryPattern.buildCar(CarType.SMALL));
        System.out.println(FactoryPattern.buildCar(CarType.HATCHBACK));
        System.out.println(FactoryPattern.buildCar(CarType.SUV));
        System.out.println(FactoryPattern.buildCar(CarType.LUXURY));
    }
}