package com.masai.q4;

public class Thread2 implements Runnable{
static int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this)
		{
			try {
				this.notifyAll();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		for(int i=1;i<=20;i++)
		{
			sum+=i;
		}
		System.out.println("Dhoni Thread: "+sum);
	}
}
