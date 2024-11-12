package com.app.example;

public class Main {
	
	

	public static void main(String[] args) {
		
		Beverage beverage  = new Cappuccino();
		
		BeverageDecorator beverageDecorator = new Almond(beverage);
		beverageDecorator = new WhippedCream(beverageDecorator);
		
		System.out.println(beverageDecorator.getCost());

	}

}
