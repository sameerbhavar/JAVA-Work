package com.masai.q4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2(); 
		Thread3 t3= new Thread3(); 
		
		Thread ta1= new Thread(t1);
		Thread ta2= new Thread(t2);
		Thread ta3= new Thread(t3);
		
		ta1.setName("Kohli");
		ta2.setName("Dhoni");
		ta3.setName("Rohit");
		
		ta2.setPriority(10);
		ta1.setPriority(8);
		ta3.setPriority(9);
		
		ta2.start();
		ta3.start();
		ta1.start();
		
	
	}

}
