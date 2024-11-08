package com.app.demo;

public class Vehicle implements DriveStrategy {
	
	DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}

	@Override
	public void drive() {
		driveStrategy.drive();
		
	}

}
