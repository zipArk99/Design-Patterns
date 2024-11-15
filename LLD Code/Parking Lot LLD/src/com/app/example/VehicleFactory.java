package com.app.example;

import java.util.Scanner;

public class VehicleFactory {
	private Vehicle vehicle;
	private Scanner scanner = new Scanner(System.in);
	private Scanner scanner2= new Scanner(System.in);

	private static VehicleFactory vehicleFactory;

	private VehicleFactory() {

	}

	public static VehicleFactory getInstance() {
		if (vehicleFactory == null) {
			synchronized (VehicleFactory.class) {
				if (vehicleFactory == null) {
					vehicleFactory = new VehicleFactory();
				}
			}

		}
		return vehicleFactory;
	}

	public Vehicle createVehicle() {
		Vehicle vehicle = null;
		System.out.println("Enter Vehicle Type");
		System.out.println("Enter 1 for car");
		System.out.println("Enter 2 for truck");
		System.out.println("Enter 3 for bus");
		int input = scanner.nextInt();
		System.out.println("Enter vehicle Number::");
		String vehicleNumber = scanner2.nextLine();

		switch (input) {
		case 1:
			vehicle = new Car(vehicleNumber);
			break;

		case 2:
			vehicle = new Truck(vehicleNumber);
			break;
		case 3:
			vehicle = new Bus(vehicleNumber);
			break;
		default: {
			System.err.println("Invalid Input");
		}

		}
		return vehicle;

	}
}
