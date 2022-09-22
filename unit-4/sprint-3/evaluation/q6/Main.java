package com.masai.q6;

import java.util.Scanner;
public class Main {

	public static double getStudent(int choice) {
		Scanner s= new Scanner(System.in);
		if(choice==1)
		{
			System.out.println("Enter The Marks for Hindi");
			int hindiMarks=s.nextInt();
			System.out.println("Enter The Marks of English");
			int engMarks=s.nextInt();
			System.out.println("Enter The marks of History");
			int hisMarks=s.nextInt();
			Student a = new ArtStudent(hindiMarks, engMarks, hisMarks);
			double per=a.findPercentage();
			return per;
		}else if(choice==2)
		{
			//choice 2 code pendfing becouse of time
		}
		else if(choice==3)
		{
			//choice 3 code pendfing becouse of time
		}else 
		{
			return 0;
		}s
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Which student percentage doy want to find");
		int choice = sc.nextInt();
		 Main m= new Main();
		 double ans= m.getStudent(choice);
		 if(ans==0)
		 {
			 System.out.println("Enter Valid Option");
		 }else{
			 System.out.println("percentage is:"+ans);
		 }
	}

}
