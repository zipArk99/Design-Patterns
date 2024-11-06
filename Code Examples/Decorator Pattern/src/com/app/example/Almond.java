package com.app.example;

public class Almond implements BeverageDecorator{
	
	Beverage beverage;
	
	public Almond(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "this are almonds";
	}

	@Override
	public int getCost() {
		return beverage.getCost()+12;
	}

}
