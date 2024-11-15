package com.app.example;

public interface ParkingLot {

	// called when vehicle enters the parking lot
	public void placeVehicle(Vehicle vehicle);

	// called when vehicle exit the parking lot
	public void removeVehicle(Vehicle vehicle);
	
	
	//used to calculate pricing 
	public long calculatePricing(ParkingTicket ticket);

}
