package com.epam.task7.structural.bridge;

public class S8 extends Samsung{

	public S8(Charger c) {
		super(c);
	}

	@Override
	public void USB() {
		System.out.print("S8 charger is ");
		charger.USB();
	} 

}