package com.masai.q5.B;

public interface Vehicle {

	void run();
	public default void service() 
	{
		System.out.println("Car need Service");
	}
}
