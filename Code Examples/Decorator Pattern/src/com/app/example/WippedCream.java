package com.app.example;

public class WippedCream implements BeverageDecorator {
	
	Beverage beverage;
	
	public WippedCream(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "this is  wipped cream";
	}

	@Override
	public int getCost() {
		return beverage.getCost()+4;
	}
	

}
