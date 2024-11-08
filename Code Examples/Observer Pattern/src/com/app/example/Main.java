package com.app.example;

public class Main {

	public static void main(String[] args) {
		AmdRyzenCpuStockObservable amdRyzenCpuStockObservable = new AmdRyzenCpuStockObservable();
		NvidiaGraphicCardStockObservable nvidiaGraphicCardStockObservable = new NvidiaGraphicCardStockObservable();
		
		
		EmailAlertObserverImpl client1 = new EmailAlertObserverImpl(amdRyzenCpuStockObservable);
		EmailAlertObserverImpl client2 = new EmailAlertObserverImpl(amdRyzenCpuStockObservable);
		
		
		SmsAlertObserverImpl client3=new SmsAlertObserverImpl(amdRyzenCpuStockObservable);
		EmailAlertObserverImpl clien3Email = new EmailAlertObserverImpl(amdRyzenCpuStockObservable);
		
		amdRyzenCpuStockObservable.add(client1);
		amdRyzenCpuStockObservable.add(client2);
		amdRyzenCpuStockObservable.add(client3);
		amdRyzenCpuStockObservable.add(clien3Email);
		nvidiaGraphicCardStockObservable.add(clien3Email);
		
		amdRyzenCpuStockObservable.setStockCount(10);
		amdRyzenCpuStockObservable.setStockCount(20);
		
		nvidiaGraphicCardStockObservable.setStockCount(10);
		
	}

}
