package com.masai;

public class Number {

	int num;
	
	void oddOrEVen() {
		if(num<0) {
			System.out.println("Error");
		}
		else if(num % 2 == 0) {
			
			while(num % 10 != 0) {
				num++;
			}
			System.out.println(num);
		}else {
			System.out.println("Odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number num1 = new Number();
		num1.num=44;
		num1.oddOrEVen();
		
		Number num2 = new Number();
		num2.num=-1;
		num2.oddOrEVen();
		
		Number num3 = new Number();
		num3.num=45;
		num3.oddOrEVen();
	}

}

