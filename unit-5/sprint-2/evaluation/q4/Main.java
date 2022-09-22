package com.masai.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls= new ArrayList<>();
		
		ls.add("Sameer");
		ls.add("Rohit");
		ls.add("Amol");
		ls.add("Ramesh");
		ls.add("Sachin");
		ls.add("KUnal");
		ls.add("Sanket");
		ls.add("Nana");
		ls.add("Pratik");
		ls.add("Harshal");
		
		//ls.stream().filter(i->(i.length()%2==0)).forEach(i->System.out.println(i.toUpperCase()));
		
		List<String> newList= ls.stream().filter((s)->(s.length()%2==0)).collect(Collectors.toList());
		
		newList.sort((s1,s2)->s2.compareTo(s1));
		System.out.println("Tranformed List");
		
		newList.forEach(i->System.out.println(i.toUpperCase()));
		System.out.println("-----------------------------------");
		System.out.println("Original List");
		ls.forEach(System.out::println);
	}

}
