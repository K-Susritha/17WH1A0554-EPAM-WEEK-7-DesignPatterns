package com.epam.task7.structural.bridge;

public class Test {
	public static void main(String[] args) {
		Samsung s8 = new S8(new Ctype());
		s8.USB();
		
		Samsung s6 = new S6(new MicroUSB());
		s6.USB();
	}
}
