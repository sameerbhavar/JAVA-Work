package com.masai.q2;

import java.util.Scanner;

public class IPL {
	
	public static void homeTeamStadium(Stadium stadium)
	{
		
		switch(stadium)
		{
		case EDEN_GARDENS_STADIUM:
		System.out.println("This is the home ground of KKR");
		break;
		
		case WANKHEDE_STADIUM:
		System.out.println("This is the home ground of Mumbai Indians");
		break;
		
		case CHIDAMBARAM_STADIUM:
		System.out.println("This is the home ground of CSK");
		break;
		
		case M_CHINNASWAMY_STADIUM:
		System.out.println("This is the home ground of RCB");
		break;
		
		default:
		System.out.println("not vAlid input");
		break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name of the Stadium");
		String stm1=sc.next();
		Stadium stm= Stadium.valueOf(stm1);
		
		homeTeamStadium(stm);
		sc.close();

	}

}
