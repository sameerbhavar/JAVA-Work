package com.masai.q3;

public class PermanentEmployee extends Employee{
	
	private  double basicPay;
	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}



	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double pfAmount=this.getBasicPay()*0.12;
		double salary= this.getBasicPay()-pfAmount;
		this.setSalary(salary);
		
		
	}

	public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	

}
