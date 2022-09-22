package com.masai.q4;

import java.util.ArrayList;
import java.util.List;

public class Main  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l= new ArrayList<>();
		l.add("pune");
		l.add("Mumbai");
		l.add("Rajsthan");
		l.add("Goa");
		l.add("MP");
		
PrintList p = c -> {
			
			for(String i:c) {
				System.out.println(i);
			}
			
		};
		
		 p.display(l);

	}

	

}
