package com.app.example;

public class SmsAlertObserverImpl implements NotificationAlertObserver {

	StockObservable observable;

	public SmsAlertObserverImpl(StockObservable observable) {
		this.observable = observable;
	}

	@Override
	public void update(String itemName) {
		sendSMS(itemName);

	}

	public void sendSMS(String itemName) {
		System.out.println("stock updated sms sent for item " + itemName);
	}

}
