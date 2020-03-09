package com.epam.task7.creational.builder;

public class Test {

	public static void main(String[] args) {
		Computer com = new Computer.ComputerBuilder("500 GB", "2 GB")
								   .setKeyboardConnected(true)
								   .setMouseConnected(true).build();
		System.out.println(com.getHDD());
		System.out.println(com.getRAM());
	}

}