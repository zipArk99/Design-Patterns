package com.app.example;

public class WhippedCream implements BeverageDecorator {
	
	Beverage beverage;
	
	public WhippedCream(Beverage beverage) {
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
