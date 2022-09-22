package com.masai.q3;


import java.util.Comparator;

public class MemCom implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return (o1.getMembershipEnddate().compareTo(o2.getMembershipEnddate()));
	}
}