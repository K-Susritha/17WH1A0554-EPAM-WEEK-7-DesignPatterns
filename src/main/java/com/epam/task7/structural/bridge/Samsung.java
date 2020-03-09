package com.epam.task7.structural.bridge;


public abstract class Samsung {
	
	protected Charger charger;
	
	public Samsung(Charger c){
		this.charger = c;
	}	
	
	abstract public void USB();
}