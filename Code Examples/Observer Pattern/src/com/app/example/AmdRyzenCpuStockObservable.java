package com.app.example;

import java.util.ArrayList;
import java.util.List;

public class AmdRyzenCpuStockObservable implements StockObservable {

	List<NotificationAlertObserver> observers = new ArrayList<>();
	int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver notificationAlertObserver) {
		observers.add(notificationAlertObserver);

	}

	@Override
	public void remove(NotificationAlertObserver notificationAlertObserver) {
		observers.remove(notificationAlertObserver);
	}

	@Override
	public void notifySubscribers() {
		for (NotificationAlertObserver observer : observers) {
			observer.update("AMD Ryzen Cpu");
		}

	}

	@Override
	public void setStockCount(int num) {

		if (stockCount == 0) {
			notifySubscribers();
		}
		stockCount += num;

	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
