package com.masai.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(1, "Sameer", 501, "Nashik");
		Student s2= new Student(2, "Harshal", 450, "Pimpalgoan");
		Student s3= new Student(3, "Somnath", 530, "Goa");
		Student s4= new Student(4, "Rahul", 520, "Mumbai");
		Student s5= new Student(5, "Amol", 410, "Pune");
		
		List<Student> stud= new ArrayList<>();
		List<Employee> emplist= new ArrayList<>();

		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		stud.add(s5);
		
//		stud.stream().filter(s->s.getMarks()>500).map(s->s.getMarks()).forEach(System.out::println);

	Stream<Student> stream = stud.stream();
	
	Stream<Employee> empStream= stream.map(sts->{
		Employee emp=null;
		
		if(sts.getMarks()>500){
			emp=new Employee(sts.getRoll(), sts.getName(), sts.getMarks()*10000, sts.getAddress());
			
			return emp;
		}
		return emp;
	});
	
	empStream.forEach(emps->{
		if(emps!= null)
		{
			emplist.add(emps);
		}
	});
	
	emplist.forEach(emps->System.out.println(emps));
	
	}
}
