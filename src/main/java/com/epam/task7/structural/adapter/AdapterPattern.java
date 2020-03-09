package com.epam.task7.structural.adapter;

public class AdapterPattern {
	AdapterPattern() {

		Dog dog = new Dog(); 
		ToyDog toyDog = new PlasticToyDog(); 

		ToyDog adapter = new AnimalAdapter(dog); 

		System.out.println("Dog"); 
		dog.walk(); 
		dog.makeSound(); 

		System.out.println("ToyDog"); 
		toyDog. giggles();  
		System.out.println("AnimalAdapter"); 
		adapter. giggles();
	}
}