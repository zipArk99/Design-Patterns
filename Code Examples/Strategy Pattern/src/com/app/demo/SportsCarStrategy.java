package com.app.demo;

public class SportsCarStrategy implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("Sports Car Strategy");
	}

}