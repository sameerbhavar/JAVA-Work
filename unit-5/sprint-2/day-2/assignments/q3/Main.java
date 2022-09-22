package com.masai.q3;

import java.util.Scanner;

public class Main implements X {

	@Override
	public int convetStringToNumber(String s) {
		try{
			int n= Integer.parseInt(s);
			return n;
		}catch(NumberFormatException nm)
		{
			throw nm;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter number in string Format");
		
		String s= sc.next() ;
		Main m= new Main();
		try {
			int n= m.convetStringToNumber(s);
			System.out.println(n);
		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.out.println(nfe.getMessage());
		}
	}

}
