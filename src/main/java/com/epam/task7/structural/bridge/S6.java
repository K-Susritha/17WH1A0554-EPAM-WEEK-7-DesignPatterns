package com.epam.task7.structural.bridge;

public class S6 extends Samsung{

	public S6(Charger c) {
		super(c);
	}

	@Override
	public void USB() {
		System.out.print("S6 charger is ");
		charger.USB();
	} 
	
}
