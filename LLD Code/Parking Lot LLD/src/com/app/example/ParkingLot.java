package com.app.example;

import java.util.List;

public interface ParkingLot {

	public List<ParkingSlot> getParkingSlots();
	
	// called when vehicle enters the parking lot
	public void placeVehicle();

	// called when vehicle exit the parking lot
	public void removeVehicle(Vehicle vehicle);
	
	
	//used to calculate pricing 
	public long calculatePricing(ParkingTicket ticket);
	
	//used to see where every vehicle is parked in parking lot
	public void viewParkingLot();

}
