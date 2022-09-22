package com.masai.q2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<String> ls =new ArrayList<>();
		
		ls.add("Nashik");
		ls.add("Amravati");
		ls.add("Baner");
		ls.add("Chandwad");
		ls.add("Dehradun");
		ls.add("Mumbai");
		
		Collections.sort(ls,(s1,s2)->s2.compareTo(s1));
		 //ls.forEach(System.out::pritnln);
		System.out.println(ls);
		
		
	}
	

}
