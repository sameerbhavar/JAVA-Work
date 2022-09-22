package com.masai.q2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	
	public static PriorityQueue<Product> pQueue = new PriorityQueue<Product>(new comparProduct());
	public static void addProduct(Product p)
	{
		int flag=0;
		if(pQueue.size()==0)
		{
			pQueue.add(p);
			System.out.println("Added Succesfully..");
		}else if(pQueue.size()!=0) {
			
			for(Product pd:pQueue)
			{
				flag=0;
				if(pQueue.equals(p))
				{
					System.out.println("Duplicate Entries");
			}
			else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				pQueue.add(p);
				System.out.println("Added Succesfully..");
			
			}
		}
}
	
	public static void showProducts()
	{
		List<Product> listProd= new ArrayList<>(pQueue);
		Collections.sort(listProd,new comparProduct());
		System.out.println("=====================");
		//System.out.println(listProd);
		java.util.Iterator<Product> itr = listProd.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("how much product do you want to add");
		int num= sc.nextInt();
		int i=1;
		while(i<=num)
		{
			System.out.println("Enter the product id");
			int pId=sc.nextInt();
			
			System.out.println("Enter the product Name");
			String pName=sc.next();
			
			System.out.println("Enter the product Price");
			double pPrice=sc.nextDouble();
			
			Product p = new Product(pId, pName, pPrice);
			
			addProduct(p);
			i++;
		}
		showProducts();
		sc.close();
	}

}
