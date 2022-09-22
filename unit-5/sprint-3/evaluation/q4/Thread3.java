package com.masai.q4;

public class Thread3 implements Runnable{
	static int sum=1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			try {
				this.wait(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
		for(int i=1;i<10;i++)
		{
			//System.out.println(i*i+1);
			sum*=i;
		}
		System.out.println("Rohit Thread: "+sum);
	}

}
