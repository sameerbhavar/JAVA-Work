package com.masai.q5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		
		List<Student> list= new ArrayList<>();
		list.add(new Student(1, "s1", 15, "b@gmail.com", "1234", new Address("mh", "nashik", "422209")));
		list.add(new Student(2, "s2", 16, "c@gmail.com", "6234", new Address("mh", "pune", "422208")));
		list.add(new Student(3, "s3", 17, "d@gmail.com", "7234", new Address("mh", "solapur", "422207")));
		list.add(new Student(4, "s4", 18, "e@gmail.com", "8234", new Address("mh", "Thane", "422205")));
		list.add(new Student(5, "s5", 19, "o@gmail.com", "9234", new Address("mh", "Mumbai", "422204")));
		
		FileOutputStream fos= new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(list);
		System.out.println("Data Added Successfully");
		oos.close();
	}

}
