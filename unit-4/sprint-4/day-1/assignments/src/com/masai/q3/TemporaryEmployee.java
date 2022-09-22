package com.masai.q3;

public class TemporaryEmployee extends Employee {
	
	private int hoursWorked;
	private int hourlyWages;
	
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
		double salary=this.getHoursWorked()*this.getHourlyWages();
		this.setSalary(salary);
		
	}
	
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}



	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	

}
