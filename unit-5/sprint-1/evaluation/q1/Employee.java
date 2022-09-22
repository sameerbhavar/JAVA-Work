package com.masai.q1;

public class Employee {
	private Integer empid;
	private String name;
	private double salary;
		
		
		public Employee(Integer empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
		
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
		}

		public Integer getEmpid() {
			return empid;
		}
		public void setEmpid(Integer empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

}
