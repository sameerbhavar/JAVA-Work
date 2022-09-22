package com.masai.q3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today= LocalDate.now();// to get current date
		System.out.println("Current Date "+today);
		
		LocalDate weekRes=today.plusWeeks(1);
		System.out.println("Add 1 week "+weekRes);
		
		LocalDate yearRes=today.plusMonths(1);
		System.out.println("Add 1 Month "+yearRes);
		
		LocalDate oneYear=today.plusYears(1);
		System.out.println("Add 1 Year "+oneYear);
		
		LocalDate tenYear=today.plusYears(10);
		System.out.println("Add 10 Year "+tenYear);
	}

}
