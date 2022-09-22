package com.masai.q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	public List<Product> productList=new ArrayList<>();
	
	public void addProductToList(Product product)
	{
	int flag = 0 ;

	if(productList.size()==0) {
		productList.add(product);
		System.out.println("Product added successfully");
	}else {
		for(Product p:productList) {
			 flag = 0 ;

			if(p.equals(product)) {

				int total = p.getCount()+product.getCount();
				p.setCount(total);
				System.out.println("Count updated Product already exists");
				break;
			}
			else {
				flag=1;
			}	
		}
		
	}
	if(flag==1) {
		productList.add(product);
		System.out.println("Product added successfully");
	}}
	
	public void showAllProduct() {
		System.out.println(productList);
	}


}
