package com.masai.q3;

public class Main {

	
	public void messageToStudents(Evaluation evaluation) 
	{
		if (evaluation instanceof DsaEvaluation)
		{
			System.out.println("Its is DSA Evaluation");
			evaluation.printNoOfQautions();
			evaluation.evolutionTiming();
			System.out.println("===============================");
		}
		else{
			System.out.println("Its a coding Evaluation");
			evaluation.printNoOfQautions();
			evaluation.evolutionTiming();
			System.out.println("=======================================");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.messageToStudents(new DsaEvaluation(5));
		m.messageToStudents(new CodingEvaluation(4));

	}

}
