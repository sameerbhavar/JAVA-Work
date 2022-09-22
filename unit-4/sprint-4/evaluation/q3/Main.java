package com.masai.q3;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> studentCollection=new TreeSet<>();
		studentCollection.add(new Student(1, "Name1", 60, 70, 80));
		studentCollection.add(new Student(2, "Name2", 50, 70, 90));
		studentCollection.add(new Student(3, "Name3", 70, 90, 80));
		studentCollection.add(new Student(4, "Name4", 88, 45, 80));
		
		Iterator<Student> iter=studentCollection.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
