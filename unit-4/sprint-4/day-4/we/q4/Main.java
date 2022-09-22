package com.masai.q4;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	
		
		System.out.println("Enter Start Date");
		String startDate=sc.next();
		
		System.out.println("Enter End Date");
		String endDate=sc.next();
		
		
		if(startDate.compareTo(endDate) > 0) {
	         System.out.println("Start date should be smaller than End date");
	      } 
		
		sc.close();
		
	}

}
