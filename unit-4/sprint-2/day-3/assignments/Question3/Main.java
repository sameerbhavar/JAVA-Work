package com.masai.sprint_2.Day_4.Question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
		stu1.roll=10;
		stu1.name="chetan";
		stu1.address="Chalisgaon";
		stu1.collageName="CIPET";
		
		System.out.println("student one details....");
		
		if(Student.getStudent(stu1.collageName == "NIT")) {
			System.out.println("Student Roll is: "+stu1.getRoll());
			System.out.println("Student Name is: "+stu1.getName());
			System.out.println("Student Address is: "+stu1.getAddress());
			System.out.println("Student Collage is: NIT");
		}
		else {
			System.out.println("Student Roll is: "+stu1.getRoll());
			System.out.println("Student Name is: "+stu1.getName());
			System.out.println("Student Address is: "+stu1.getName());
			System.out.println("Student Collage is: "+stu1.getCollageName());
		}
		
		Student stu2 = new Student(22,"AKash","Delhi","NIT");
		
		System.out.println("student two details....");
	
		if(Student.getStudent(stu2.collageName == "NIT")) {
			System.out.println("Student Roll is: "+stu2.getRoll());
			System.out.println("Student Name is: "+stu2.getName());
			System.out.println("Student Address is: "+stu2.getAddress());
			System.out.println("Student Collage is: NIT");
		}
		else {
			System.out.println("Student Roll is: "+stu2.getRoll());
			System.out.println("Student Name is: "+stu2.getName());
			System.out.println("Student Address is: "+stu2.getName());
			System.out.println("Student Collage is: "+stu2.getCollageName());
		}
		
		
	}

}
