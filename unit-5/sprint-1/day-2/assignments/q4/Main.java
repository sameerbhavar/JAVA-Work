package com.masai.q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, List<String>> hm = new HashMap<>();
	    //List<String> li = Arrays.asList("Nashik","Pune");
		hm.put("Maharashta",Arrays.asList("Nashik","Pune"));
		hm.put("Punjab",Arrays.asList("Nashik","Pune"));
		hm.put("Utarkhand",Arrays.asList("Nashik","Pune"));
		hm.put("Goa",Arrays.asList("absd","goa"));
		
//		System.out.println(hm.size());
		
		Set<Map.Entry<String,List<String>>> ss = hm.entrySet();
		
		LinkedList<Map.Entry<String,List<String>>> ll =  new LinkedList<>(ss);
		
		Collections.sort(ll,new SortStateComp());
		
		for(Map.Entry<String, List<String>> j :ll) {
			
			System.out.println("State name is "+j.getKey());
			
			System.out.println("Cites are : ");
			
			for(String l : j.getValue()) {
				
				System.out.print(l);
				
			}
			System.out.println();
			
			
		}
		
		

	}

}
