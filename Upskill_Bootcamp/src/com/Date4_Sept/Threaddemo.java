package com.Date4_Sept;

public class Threaddemo extends Thread{
	public void run()
	{
		display();
	}
	
	public void display()
	{
		try
		{
		for(int i=0;i<10;i++)
		{
			System.out.println("---------->"+ this.getName() +"-->" + i);
			sleep(2000);
;		}
		}catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
}
