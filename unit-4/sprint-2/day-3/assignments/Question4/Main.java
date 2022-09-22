package com.masai.sprint_2.Day_4.Question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car() ;
		car1.model="Harrier";
		car1.companyName="TATA";
		car1.Color="Black";
		car1.engine = new Engine();
		car1.engine.rpm=10000;
		car1.engine.Power=110;
		car1.engine.manufacturer="TATA";
		car1.engine.hasTurbo=car1.engine.enable(true);
		
		System.out.println("Showing first car details......");
		System.out.println("Car Model: "+car1.model);
		System.out.println("Car Company Name: "+car1.companyName);
		System.out.println("Car Color: "+car1.Color);
		System.out.println("Car RPM "+car1.engine.rpm);
		System.out.println("Car Power: "+car1.engine.Power);
		System.out.println("Car Engine Manufacturer: "+car1.engine.manufacturer);
		System.out.println("Car Has Turbo: "+car1.engine.hasTurbo);
		
		
		Car car2 = new Car("Nexon", "TATA", "White",new Engine());
		car2.engine.rpm=9000;
		car2.engine.Power=100;
		car2.engine.manufacturer="TATA";
		car2.engine.hasTurbo=car2.engine.enable(false);
		
		System.out.println("Showing Second car details......");
		System.out.println("Car Model: "+car2.model);
		System.out.println("Car Company Name: "+car2.companyName);
		System.out.println("Car Color: "+car2.Color);
		System.out.println("Car RPM "+car2.engine.rpm);
		System.out.println("Car Power: "+car2.engine.Power);
		System.out.println("Car Engine Manufacturer: "+car2.engine.manufacturer);
		System.out.println("Car Has Turbo: "+car2.engine.hasTurbo);
	}

}
