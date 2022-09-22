package com.masai.q2;

public class ThreadA implements Runnable {
	static int sum=1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this)
		{
			for(int i=1;i<10;i++)
			{
				//System.out.println(i*i+1);
				sum*=i;
			}
			
			this.notify();
		}
		
		
	}
	

}
