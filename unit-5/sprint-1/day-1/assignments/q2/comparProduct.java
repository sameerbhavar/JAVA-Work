package com.masai.q2;

import java.util.Comparator;

public class comparProduct implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		if(o1.getProductPrice()>o2.getProductPrice()) {
			return -1;
		}else {
			return 1;
		}
		
	}

}
