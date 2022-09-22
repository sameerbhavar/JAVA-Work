package com.masai.q3;

public abstract class Evaluation {
	
	private final int numberofQuations;
	
	public int getNumberofQuations()
	{
		return numberofQuations;
	}
	
	
	abstract void evolutionTiming();
	
	void printNoOfQautions(){
		System.out.println("No.of Quation in evolution is:"+ numberofQuations);
		
	}
	
	public Evaluation(int n)
	{
		super();
		this.numberofQuations=n;
	}
	
}
