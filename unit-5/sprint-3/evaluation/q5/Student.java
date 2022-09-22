package com.masai.q5;

import java.io.Serializable;

public class Student implements Serializable {

	private int roll;
	private String name;
	private int marks;
    private String email;
	transient String password;
    Address address ;// Has-A relationship
    
	public Student() {
		super();
	}

	public Student(int roll, String name, int marks, String email, String password, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
	
	

}