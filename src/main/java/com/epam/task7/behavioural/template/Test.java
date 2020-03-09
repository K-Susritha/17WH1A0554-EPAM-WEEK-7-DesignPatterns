package com.epam.task7.behavioural.template;

public class Test {

	public static void main(String[] args) {

		RobotTemplate robotType = new HumanoidRobot();

		System.out.println("HUMANOID ROBOT");
		robotType.Robot();
		System.out.println();
		System.out.println("INDUSTRIAL ROBOT");
		robotType = new IndustrialRobot();
		robotType.Robot();

	}

}
