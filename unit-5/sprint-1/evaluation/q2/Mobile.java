package com.masai.q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	static HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model)
	{
		
		ArrayList<String> m=new ArrayList<>();
		if(!mobiles.containsKey(company))
		{
			m.add(model);
			mobiles.put(company, m);
		}else 
		{
			m=mobiles.get(company);
			m.add(model);
			mobiles.put(company, m);
		}
		return "Mobile Added SuccessFully";
	}

	public static List<String> getmodel(String Company)
	{
		List<String> list=new ArrayList<>();
		if(mobiles.containsKey(Company))
		{
			list=mobiles.get(Company);
		}
		return list;
	}
	
	
	
	public static void main(String[] args) {
		Mobile mb= new Mobile();
		System.out.println(mb.addMobile("micromax", "2kll"));
		System.out.println(mb.addMobile("Nokia", "Ash55"));
		System.out.println(mb.addMobile("Samsung", "A1"));
		System.out.println(mb.addMobile("Mi", "j2"));
		System.out.println(mb.addMobile("Dell", "p2"));
		
		System.out.println("--------------------");
		
		List<String> a=Mobile.getmodel("Dell");
		if(a.size()!=0)
		{
			for(String ans:a)
			{
				System.out.println(ans);
			}
		}else{
			System.out.println("Invalid Company");
		}
	}


}
