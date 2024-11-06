package com.app.example;

public interface BeverageDecorator extends Beverage {

	@Override
	public String getDescription();

	@Override
	public int getCost() ;
}
