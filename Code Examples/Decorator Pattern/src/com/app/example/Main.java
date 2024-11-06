package com.app.example;

public class Main {
	
	

	public static void main(String[] args) {
		
		Beverage beverage  = new Cappuccino();
		
		BeverageDecorator beverageDecorator = new Almond(beverage);
		BeverageDecorator beverageDecorator2 = new WippedCream(beverageDecorator);
		
		System.out.println(beverageDecorator2.getCost());

	}

}
