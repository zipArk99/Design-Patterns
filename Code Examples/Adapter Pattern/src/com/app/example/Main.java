package com.app.example;

public class Main {

	public static void main(String[] args) {
		
		WildTurkey wildTurkey = new WildTurkey();
		
		Duck tkDuck = new TurkeyAdapter(wildTurkey);
		
		tkDuck.quack();

	}

}
