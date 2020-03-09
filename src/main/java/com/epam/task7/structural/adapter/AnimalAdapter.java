package com.epam.task7.structural.adapter;

public class AnimalAdapter implements ToyDog {
	Animal animal; 
	
    public AnimalAdapter(Animal animals)  { 
        this.animal = animals; 
    } 
  
    public void giggles() { 
    	animal.makeSound(); 
    } 
}