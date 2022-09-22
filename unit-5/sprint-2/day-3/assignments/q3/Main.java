package com.masai.q3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static Map<String, Student> sortMapUsingStudentName(Map<String, Student>
	originalMap) {
		//Set<Map.Entry<String, Student>> set = 
		
		Set<Map.Entry<String, Student>> ss = originalMap.entrySet();
		
		
		Set<Map.Entry<String, Student>> sortList = new TreeSet<>(
				(s1,s2)->s1.getValue().getMarks()>s2.getValue().getMarks()?1:-1);
		
		sortList.addAll(ss);
		
		Map<String, Student> map=new HashMap<>();
		
		for(Map.Entry<String, Student> l : sortList) {
			
			map.put(l.getKey(), l.getValue());
			
		}
		
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map= new HashMap<>();
		
		map.put("India", new Student(1,"Sameer", "sameer@gmail.com", 120));
		map.put("Pak", new Student(1,"mj", "mj@gmail.com", 220));
		map.put("Ban", new Student(1,"Arjun", "arjun@gmail.com", 100));
		map.put("Lanka", new Student(1,"Mohit", "mohit@gmail.com", 320));
		map.put("Aus", new Student(1,"Jayesh", "Jayesh@gmail.com", 420));
		
		//System.out.println(sortMapUsingStudentName(map));
		
		Map<String , Student> fM = sortMapUsingStudentName(map);
		
		for(String s:fM.keySet())
		{
			System.out.println(s);
		}

	}

}
