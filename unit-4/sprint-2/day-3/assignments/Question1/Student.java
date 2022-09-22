package com.masai.sprint_2.Day_4.Question1;

public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int age, int marks) {
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public void validationCheck() {
		if(age > 18 && age < 60 && marks > 0 && marks < 500) {
			System.out.println("Valid Student");
		}
		else {
			System.out.println("Invalid Student");
		}
	}
	
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}


}
