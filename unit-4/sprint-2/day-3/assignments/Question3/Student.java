package com.masai.sprint_2.Day_4.Question3;

public class Student {

	int roll; 
	String name;
	String address;
	String collageName;
	
	public Student(){
		
	}
	
	public Student(int roll, String name, String address, String collageName) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	
	
	
	public int getRoll() {
		return roll;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCollageName() {
		return collageName;
	}
	
	public static boolean getStudent(boolean clg) {
		if(clg == true) {
			return true;
		}else {
			return false;
		}
	}
	
}
