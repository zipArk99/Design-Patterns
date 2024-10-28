package com.app.example;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
	
	StockObservable observable;

	
	public EmailAlertObserverImpl(StockObservable observable) {
		this.observable = observable;
	}

	@Override
	public void update(String itemName) {
		sendSMS(itemName);

	}

	public void sendSMS(String itemName) {
		System.out.println("stock updated email sent for item " + itemName);
	}

}
