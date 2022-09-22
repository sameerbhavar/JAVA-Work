package com.masai.q1;

import java.util.Scanner;

public class Mobile {

	public  void searchOutdatedModel(String company,String model)
	{
		int flag=0;
		String[] outdatedModels = {"note4","note5","note6","note7"};
		for(int i=0;i<outdatedModels.length;i++)
		{
			if(model.equals(outdatedModels[i]))
			{
				flag=1;
				System.out.println(outdatedModels[i]+"_OUTDATED");
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Company is"+company);
			System.out.println("model is"+model);
		}
	}
	
	
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Mobile Company");
		String company=sc.next();
		System.out.println("Enter mobile model");
		String model=sc.next();
		m.searchOutdatedModel(company, model);
		sc.close();
		
	}
}
