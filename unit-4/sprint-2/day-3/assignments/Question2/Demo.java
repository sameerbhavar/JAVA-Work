package com.masai.sprint_2.Day_4.Question2;

public class Demo {

	public Demo() {
		this("masai");
		System.out.println("Inside zero argument constructor Demo() of Demo class");
	}
	
	public Demo(String s) {
		this(10);
		System.out.println("Inside one argument constructor Demo(String s) of Demo class");
	}
	
	public Demo(int i) {
		this(20.00f);
		System.out.println("Inside one argument constructor Demo(int i) of Demo class");
	}
	
	public Demo(float f) {
		System.out.println("Inside one argument constructor Demo(float f) of Demo class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo();
	}

}
