package com.app.example;

enum SlotSize {
	MEDIUM, LARGE, EXTRA_LARGE
}


public class ParkingSlot {
	
	private Vehicle vehicle;
	private boolean isOccupied;
	private final SlotSize slotSize;
	
	ParkingSlot(SlotSize slotSize){
		this.slotSize = slotSize;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public SlotSize getSlotSize() {
		return slotSize;
	}
	
	
}
