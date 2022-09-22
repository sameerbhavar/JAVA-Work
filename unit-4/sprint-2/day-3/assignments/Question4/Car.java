package com.masai.sprint_2.Day_4.Question4;

public class Car {

	String model;
	String companyName;
	String Color;
	Engine engine;
	
	public Car() {
		
	}
	
	public Car(String model, String companyName, String Color, Engine engine) {
		this.model = model;
		this.companyName=companyName;
		this.Color=Color;
		this.engine= new Engine();
	}
}
