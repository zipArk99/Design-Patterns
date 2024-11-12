package com.app.example;

public class TurkeyAdapter implements Duck {

	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void fly() {

	}

	@Override
	public void quack() {
		turkey.gobble();

	}

}
