package com.masai.q3;

public class Loan {

	
	private Loan() 
	{
		super();
	}
	
	public static Loan getLoan(){
		
		Loan l = new Loan();
		
		return l;
	}
	
	
	public double calculateLoanAmount(Employee employeeObj)
	{
	
		
		if(employeeObj instanceof PermanentEmployee)
		{
			employeeObj.calculateSalary();
			double s=employeeObj.getSalary();
			
			double amount=(s*15)/100;
			return amount;
		}
		
		else if(employeeObj instanceof TemporaryEmployee)
		{
			employeeObj.calculateSalary();
			double s=employeeObj.getSalary();
			double amount=(s*10)/100;
			return amount;
		}
		else 
		{
			return 0;
		}
	}
	
}
