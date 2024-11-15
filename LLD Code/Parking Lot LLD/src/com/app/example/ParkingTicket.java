package com.app.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {
	private final String uniqueNumber;
	private final int assignedLotNumber;
	private final LocalDateTime tickedAssignedTime;

	public ParkingTicket(int assignedLotNumber) {
		this.uniqueNumber = UUID.randomUUID().toString();
		this.assignedLotNumber = assignedLotNumber;
		this.tickedAssignedTime = LocalDateTime.now();

	}

	public String getUniqueNumber() {
		return uniqueNumber;
	}

	public int getAssignedLotNumber() {
		return assignedLotNumber;
	}

	public LocalDateTime getTickedAssignedTime() {
		return tickedAssignedTime;
	}
	
	

}
