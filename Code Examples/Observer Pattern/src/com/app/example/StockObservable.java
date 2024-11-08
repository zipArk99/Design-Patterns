package com.app.example;

public interface StockObservable{

	public void add(NotificationAlertObserver notificationAlertObserver);

	public void remove(NotificationAlertObserver notificationAlertObserver);

	public void notifySubscribers();

	public void setStockCount(int num);

	public int getStockCount();

}
