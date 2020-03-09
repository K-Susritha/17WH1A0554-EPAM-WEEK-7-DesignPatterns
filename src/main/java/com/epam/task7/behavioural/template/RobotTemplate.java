package com.epam.task7.behavioural.template;

public abstract class RobotTemplate {

	public final void Robot(){
		bodyStructure();
		powerSource();
		muscleSystem();
		sensorySystem();
		brainSystem();
		System.out.println("\tRobot working good.");
	}

	private void powerSource() {
		System.out.println("\tPower supply : Done");
	}

	public abstract void muscleSystem();
	public abstract void sensorySystem();
	public abstract void brainSystem();

	private void bodyStructure() {
		System.out.println("\tBody state : Activated");
	}
}
