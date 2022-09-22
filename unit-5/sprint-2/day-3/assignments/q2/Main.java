package com.masai.q2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1.Predicate
		Predicate<Student> p= stud -> stud.getMarks()>500;
		System.out.println("Predicate");
		System.out.println(p.test(new Student(1, "sameer", 420, "Nashik")));
		System.out.println("----------------------------");
		
		
// 2.Consumer
		Consumer<Student> c= stud-> System.out.println(stud);
		System.out.println("Consumer");
		c.accept(new Student(2, "mayank", 450,"mumbai"));
		System.out.println("----------------------------");
		
// 3.Supplier
		Supplier<Student> s=()-> new Student(3, "rahul", 200, "Vani");
		System.out.println(s.get());
		System.out.println("----------------------------");
		
// 4.Function
		Function<String, Integer> f= st -> Integer.parseInt(st);
		System.out.println("function");
		System.out.println(f.apply("5")+15);
		System.out.println("-----------------------");
		
	}

}
