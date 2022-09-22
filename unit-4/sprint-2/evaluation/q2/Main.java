package com.masai;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number Of student You want To Enter");
		System.out.println("-------------------------------------------");
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int i=1;
		while(i<=tc){
			System.out.println("Enter the Roll Number");
			int rollNumber=sc.nextInt();
			
			System.out.println("Enter Student Name");
			String studentName=sc.next();
			
			System.out.println("Enter Marks");
			 int marks=sc.nextInt();
			 
			 Student studObj=new Student(rollNumber,studentName,marks);
			// System.out.println("-------------------------------------------------");
			 System.out.println("Student Detail:"+i);
			 
			 System.out.println("student Roll Number"+studObj.getRollNumber());
			 
			 System.out.println("student Name"+studObj.getStudentName());
			 
			 System.out.println("student Marks"+studObj.getMarks());
			 
			 System.out.println("-------------------------------------------------");
			 i++;
			
			
		}
		
	}

}
