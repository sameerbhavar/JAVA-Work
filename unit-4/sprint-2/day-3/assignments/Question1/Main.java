package com.masai.sprint_2.Day_4.Question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
		stu1.setRoll(15);
		stu1.setName("Chetan");
		stu1.setAge(22);
		stu1.setMarks(90);
		
		System.out.println("Student one Details.........");
		
		System.out.println("Student Roll is: "+stu1.getRoll());
		System.out.println("Student Name is: "+stu1.getName());
		System.out.println("Student Age is: "+stu1.getAge());
		System.out.println("Student Marks are: "+stu1.getMarks());
		
		stu1.validationCheck();
		
		
		Student stu2 = new Student(20,"Tejas",15,80);
		
		System.out.println("Student Two Details.........");
		System.out.println("Student Roll is: "+stu2.getRoll());
		System.out.println("Student Name is: "+stu2.getName());
		System.out.println("Student Age is: "+stu2.getAge());
		System.out.println("Student Marks are: "+stu2.getMarks());
		
		stu2.validationCheck();
		
	}

}
