package com.masai.q1;


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
	  
	  Set<Map.Entry<Employee,String>> st=originalMap.entrySet();
	  List<Map.Entry<Employee,String>> li= new LinkedList<>(st);
	  Collections.sort(li,new SalSort());
	  
	  HashMap<Employee,String>ret=new LinkedHashMap<>();
	  for(Map.Entry<Employee, String>i:li)
	  {
		  ret.put(i.getKey(), i.getValue());
	  }
	  return ret;
  
	}
	
	public static void main(String[] args) {
		HashMap<Employee, String> hs= new HashMap<>();

		
		hs.put(new Employee(1, "ram", 4000),"Nashik");
		hs.put(new Employee(2, "Rakesh", 5000),"pune");
		hs.put(new Employee(3, "Sameer", 6000),"mumbai");
		hs.put(new Employee(4, "Atul", 7000),"denmark");
		hs.put(new Employee(5, "Patik", 8000),"Thane");
		
		Demo d = new Demo();
		
		Map<Employee,String>mAp=d.sortMapUsingEmployeeSalary(hs);
		Set<Map.Entry<Employee, String>> print= mAp.entrySet();
		
		for(Map.Entry<Employee, String>ans:print)
		{
			System.out.println();
			System.out.println(ans.getKey());
			System.out.println(ans.getValue());
			System.out.println("---------------------------");
		}
	}


}
