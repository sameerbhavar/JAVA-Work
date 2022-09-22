package com.masai.q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA ta= new ThreadA();
		
		Thread t1= new Thread(ta);
		t1.start();
		
		synchronized(t1)
		{
			try {
				t1.wait();
			} catch (InterruptedException i) {
				// TODO: handle exception
				i.printStackTrace();
			}
		}
		System.out.println("product of 1 to 10: "+ta.sum);
	}

}
