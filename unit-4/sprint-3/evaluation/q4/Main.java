package com.masai.q4;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String =>");
		
		str=sc.nextLine();
		
		int length = str.length();
		
		System.out.println("Enter a Position =>");
		
		int pos=sc.nextInt();
		
		if(pos<0 || pos>= length)
		{
			System.out.println("Invalid position, Please enter a valid position =>");
			System.out.println(pos);
			pos=sc.nextInt();
		}
		else{
			System.out.println("Charater at the position" +" "+ pos + "=> " + str.charAt(pos));
		}
		sc.close();
	}

}
