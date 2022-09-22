package com.masai;

public class Lion {

	
	String name;
	boolean isHungry;
    int age;
    static int totalDeaths;

	   void thinking() {
		if(isHungry == false) {
			System.out.println(name+" is sleeping");
		}
		else if(isHungry==true && age>12) {
			totalDeaths=totalDeaths+2;
			System.out.println(name+" has killed two animal");
		}
		else if(isHungry==true && age<=12 && age >=2) {
			totalDeaths=totalDeaths+1;
			System.out.println(name+" has killed one animal");
		}
		else {
			System.out.println(name+"is calling Mom");
		}
	}

     static void printKillings() {
  	 System.out.println("Total killings by lions in jungle = "+ totalDeaths);
  	 }
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion lion1 = new Lion();
		lion1.name = "lion1";
		lion1.age = 12;
		lion1.isHungry=true;
		lion1.thinking();
//		lion1.printKillings();
		
		Lion lion2 = new Lion();
		lion2.name = "lion2";
		lion2.age = 15;
		lion2.isHungry=false;
		lion2.thinking();
//		lion2.printKillings();
		
		Lion lion3 = new Lion();
		lion3.name = "lion3";
		lion3.age = 9;
		lion3.isHungry=true;
		lion3.thinking();
		printKillings();
	}

}