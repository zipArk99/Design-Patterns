package com.app.example;

enum VehicleSize {
	MEDIUM, LARGE, EXTRA_LARGE
}

public class Vehicle {
	private final String vehicleNumberPlate;
	private final VehicleSize vehicleSize;
	private ParkingTicket parkingTicket;

	Vehicle(String vehicleNumberPlate, VehicleSize vehicleSize) {
		this.vehicleNumberPlate = vehicleNumberPlate;
		this.vehicleSize = vehicleSize;
	}

	public String getVehicleNumberPlate() {
		return vehicleNumberPlate;
	}

	public VehicleSize getVehicleSize() {
		return vehicleSize;
	}

	public ParkingTicket getParkingTicket() {
		return parkingTicket;
	}

	public void setParkingTicket(ParkingTicket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}
	
	

}
