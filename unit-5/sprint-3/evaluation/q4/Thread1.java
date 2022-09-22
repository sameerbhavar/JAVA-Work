package com.masai.q4;


public class Thread1  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			try {
				this.wait(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("Kohli Thread: "+i);
			}
		}
		
	}
}
