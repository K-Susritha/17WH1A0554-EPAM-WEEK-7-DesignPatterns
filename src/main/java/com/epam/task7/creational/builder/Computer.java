package com.epam.task7.creational.builder;

public class Computer {
	
	private String HDD;
	private String RAM;
	
	private boolean isMouseConnected;
	private boolean isKeyboardConnected;
	

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isMouseConnected() {
		return isMouseConnected;
	}

	public boolean isKeyboardConnected() {
		return isKeyboardConnected;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isMouseConnected = builder.isMouseConnected;
		this.isKeyboardConnected = builder.isKeyboardConnected;
	}
	
	public static class ComputerBuilder{

		private String HDD;
		private String RAM;

		private boolean isMouseConnected;
		private boolean isKeyboardConnected;
		
		public ComputerBuilder(String hdd, String ram){
			this.HDD=hdd;
			this.RAM=ram;
		}

		public ComputerBuilder setMouseConnected(boolean isMouseConnected) {
			this.isMouseConnected = isMouseConnected;
			return this;
		}

		public ComputerBuilder setKeyboardConnected(boolean isKeyboardConnected) {
			this.isKeyboardConnected = isKeyboardConnected;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}

	}

}