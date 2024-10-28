package com.app.demo;

public class NormalCarVehicle extends Vehicle {

	public NormalCarVehicle() {
		super(new NormalCarStrategy());

	}

	@Override
	public void drive() {
		super.drive();
	}
	

}
