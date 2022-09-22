package com.masai.q1;
import java.util.Scanner;
public class RevString {
	
	public static String reversString(String input){
		//write the logic

		char ch;
		String str="";
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			str=ch+str;
		}
		return str;
		
		}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		sc.close();
		}


}
