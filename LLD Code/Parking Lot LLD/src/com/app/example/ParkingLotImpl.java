
package com.app.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingLotImpl implements ParkingLot {

	List<ParkingSlot> parkingSlots = new ArrayList<>();

	public ParkingLotImpl() {
		parkingSlots.add(new ParkingSlot(SlotSize.MEDIUM));
		parkingSlots.add(new ParkingSlot(SlotSize.MEDIUM));
		parkingSlots.add(new ParkingSlot(SlotSize.MEDIUM));
		parkingSlots.add(new ParkingSlot(SlotSize.MEDIUM));
		parkingSlots.add(new ParkingSlot(SlotSize.LARGE));
		parkingSlots.add(new ParkingSlot(SlotSize.LARGE));
		parkingSlots.add(new ParkingSlot(SlotSize.LARGE));
		parkingSlots.add(new ParkingSlot(SlotSize.EXTRA_LARGE));
		parkingSlots.add(new ParkingSlot(SlotSize.EXTRA_LARGE));
	}

	@Override
	public List<ParkingSlot> getParkingSlots() {
		return parkingSlots;
	}

	@Override
	public void placeVehicle() {
		Vehicle vehicle = VehicleFactory.getInstance().createVehicle();
		for (int i = 0; i < parkingSlots.size(); i++) {
			ParkingSlot parkingSlot = parkingSlots.get(i);
			if (!parkingSlot.isOccupied()
					&& parkingSlot.getSlotSize().toString().equals(vehicle.getVehicleSize().toString())) {
				parkingSlot.setVehicle(vehicle);
				parkingSlot.setOccupied(true);
				vehicle.setParkingTicket(new ParkingTicket(i));
				return;
			}

		}
		System.out.println("---no parking slots available---");
	}

	@Override
	public void removeVehicle(Vehicle vehicle) {
		ParkingSlot parkingSlot = parkingSlots.get(vehicle.getParkingTicket().getAssignedSlotNumber());
		parkingSlot.setOccupied(false);
		parkingSlot.setVehicle(null);
		long totalCost = calculatePricing(vehicle.getParkingTicket());
		System.out.println("---total parking cost---::" + totalCost);
	}

	@Override
	public long calculatePricing(ParkingTicket ticket) {
		int pricePerHour = 10;
		LocalDateTime timeVehicleParked = ticket.getTickedAssignedTime();
		LocalDateTime timeVehicleExited = LocalDateTime.now();
		Duration duration = Duration.between(timeVehicleParked, timeVehicleExited);
		System.out.println(timeVehicleParked);
		System.out.println(timeVehicleExited);
		return duration.toHours() * pricePerHour;

	}

	@Override
	public void viewParkingLot() {
		for (int i = 0; i < parkingSlots.size(); i++) {

			System.out.println(i + " .... " + parkingSlots.get(i));

		}

	}

}
