package com.masai;

public class Main {

		public static void runScored(int one, int two, int three, int four ,int six) {
		// write your logic here
			one=one*1;
			two=two*2;
			three=three*3;
			four=four*4;
			six=six*6;
		int total	= one+two+three+four+six;
		System.out.println(total);
		}
		
		public static void main(String[] args){
		//call runScored with valid parameters
			runScored(6,2,1,4,2);
		}

}

