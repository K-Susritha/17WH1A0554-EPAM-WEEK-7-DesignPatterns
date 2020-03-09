package com.epam.task7.behavioural.template;

public class HumanoidRobot extends RobotTemplate{
	@Override
	public void brainSystem() {
		System.out.println("\tBrain : Processing data");
	}

	@Override
	public void muscleSystem() {
		System.out.println("\tMuscle : Approximate movements");
	}

	@Override
	public void sensorySystem() {
		System.out.println("\tSensors : Receiving information");
	}
}
