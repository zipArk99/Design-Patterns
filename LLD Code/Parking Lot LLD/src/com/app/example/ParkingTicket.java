package com.app.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {
	private final String uniqueNumber;
	private final int assignedSlotNumber;
	private final LocalDateTime tickedAssignedTime;

	public ParkingTicket(int assignedSlotNumber) {
		this.uniqueNumber = UUID.randomUUID().toString();
		this.assignedSlotNumber = assignedSlotNumber;
		this.tickedAssignedTime = LocalDateTime.now();

	}

	public String getUniqueNumber() {
		return uniqueNumber;
	}

	public int getAssignedSlotNumber() {
		return assignedSlotNumber;
	}

	public LocalDateTime getTickedAssignedTime() {
		return tickedAssignedTime;
	}

	@Override
	public String toString() {
		return "ParkingTicket [uniqueNumber=" + uniqueNumber + ", assignedLotNumber=" + assignedSlotNumber
				+ ", tickedAssignedTime=" + tickedAssignedTime + "]";
	}
	
	

}
