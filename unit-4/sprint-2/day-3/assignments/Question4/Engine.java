package com.masai.sprint_2.Day_4.Question4;

public class Engine {

	int rpm;
	int Power;
	String manufacturer;
	boolean hasTurbo;
	
	public boolean enable(boolean hasTurbo) {
		if(hasTurbo == true) {
			return true;
		}else {
			return false;
		}
	}

}
