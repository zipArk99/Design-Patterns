package com.app.example;

enum Singleton {
	INSTANCE;

	private  String name;
	private  int age;
	

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	

 
	
	
	

}

class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

}

public class Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.INSTANCE;
		singleton.setName("shaurya");
		System.out.println(singleton.getName());
		Singleton singleton2 = Singleton.INSTANCE;
		singleton2.setName("Raju");
		System.out.println(singleton.getName());
		
		
		System.out.println(singleton==singleton2);
		
		//singleton.setValue(new Person("Shaurya", 23));
		//System.out.println(singleton.hashCode());
		//Singleton singleton2 = Singleton.INSTANCE;
		//System.out.println(singleton2.hashCode());
		//System.out.println(singleton2.getValue().getName());

	}

}
