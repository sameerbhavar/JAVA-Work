package com.masai.q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void dateBirth(LocalDate dob)
	{
		LocalDate curDate = LocalDate.now(); 
		int dif=curDate.compareTo(dob);
		
		if(dif<=0) {
			
			System.out.println("Date should not be in Future");
			
		}else {
		
			System.out.println(dif+"Age");
		
		}
		//calculates the amount of time between two dates and returns the years  
		
//		if ((dob != null) && (curDate != null))   
//		{  
//		return Period.between(dob, curDate).getYears();  
//		}  
//		else if(dif==0)
//		{
//			System.out.println("Date should not be in Future");
//		}
//		{  
//		return 0; 
//		}  
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		try {
		System.out.println("ENter The Date of Birth in this format dd/MM/yyyy");
		String sDate1=sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dob = LocalDate.parse(sDate1, formatter); 
//		System.out.println(dateBirth(dob));
		dateBirth(dob);
		}catch(DateTimeException dt)
		{
			System.out.println(dt);
		}
		System.out.println("Main End");
	}

}
