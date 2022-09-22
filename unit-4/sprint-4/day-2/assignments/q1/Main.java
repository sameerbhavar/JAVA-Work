package com.masai.q1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arlist = new ArrayList<>();
		
		arlist.add("Sameer");
		arlist.add("Pratik");
		arlist.add("Rahul");
		arlist.add("Amol");
		arlist.add("olao");
		arlist.add("Sameer");
		
		//using enhance for loop
		for(String a:arlist)
			System.out.println(a);
		{
			
		}
		
		Iterator<String> i=arlist.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next()+" iterator method");
		}
		
		

	}

}
