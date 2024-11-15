package com.app.example;

public class Main {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLotImpl();
		parkingLot.placeVehicle(VehicleFactory.getInstance().createVehicle());

	}

}
