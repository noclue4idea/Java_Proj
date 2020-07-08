package com.prtc;

public class ThreadDemo  extends Thread {
	
	int i;
	
	ThreadDemo(int i)
	{
		this.i=i;
	}
	
	public void run()
	{
		System.out.println("executing the thread::"+i);
		if(i==1)
		{
			try {
				Thread.sleep(32);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
