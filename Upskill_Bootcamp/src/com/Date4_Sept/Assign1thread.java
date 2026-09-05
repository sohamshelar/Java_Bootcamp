package com.Date4_Sept;

public class Assign1thread extends Thread{
	String opr;
	public Assign1thread(String opr)
	{
		this.opr=opr;
	}
	public void run()
	{
		if(opr.equals("N"))
		{
		display1();
		}
		else if(opr.equals("C"))
		{
		display2();
		}
	}
	
	public void display1()
	{
		for(int i=0;i<50;i++)
		System.out.println("--->" +this.getName() +"--->"+ i);
	}
	
	public void display2()
	{
		for(char ch ='A' ; ch<'Z';ch++)
		{
			System.out.println("---->" + this.getName()+"--->" +ch);
		}
	}
}
//
