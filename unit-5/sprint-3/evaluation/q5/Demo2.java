package com.masai.q5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file1 = new FileInputStream("studentdata.txt");
		ObjectInputStream ois= new ObjectInputStream(file1);
		
		List<Student> s1=(List<Student>)ois.readObject();
		
		s1.forEach(s->System.out.println(s));
		
		FileOutputStream file2= new FileOutputStream("studentdata.txt");
		ObjectOutputStream ois2= new ObjectOutputStream(file2);
		
		s1.add(new Student(11, "s11", 19,"o@gmail.com","9234", new Address("mh", "Hyderbad", "422209")));
		ois2.writeObject(s1);
		System.out.println("+---------------------------+");
		 FileInputStream file3 = new FileInputStream("studentdata.txt");
		 ObjectInputStream ois3= new ObjectInputStream(file3);
		 
			List<Student> s2=(List<Student>)ois3.readObject();
			s2.forEach(a->System.out.println(a));
	}
	
}
