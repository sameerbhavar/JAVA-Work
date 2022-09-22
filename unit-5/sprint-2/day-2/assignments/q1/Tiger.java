package com.masai.q1;

public class Tiger extends Animal {

	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() throws AnimalException {
		// TODO Auto-generated method stub
		System.out.println("Tiger is eating");
		
	}
	
	public static void main(String[] args) throws AnimalException {
		Animal a = new Tiger();
		try{
			//a= new Tiger();
			a.eat();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
