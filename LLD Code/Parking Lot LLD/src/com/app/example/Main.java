package com.app.example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ParkingLot parkingLot = new ParkingLotImpl();

		do {
			System.out.println("1. place a vehicle in parking lot");
			System.out.println("2. remove vehicle from parking lot ");
			System.out.println("3. view parking lot");
			int input = scanner.nextInt();

			switch (input) {
			case 1:
				parkingLot.placeVehicle();
				break;
			case 2:
				System.out.println("Enter vehicle slot that you want to remove");
				int number = scanner.nextInt();
				Vehicle vehicle = parkingLot.getParkingSlots().get(number).getVehicle();
				parkingLot.removeVehicle(vehicle);
				break;
			case 3:
				parkingLot.viewParkingLot();
				break;
			}
		} while (true);

	}

}
