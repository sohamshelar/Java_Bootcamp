package com.Day7Tue25Aug;

public class BaseClassDemo {
	int x;
	int y;
	
	public BaseClassDemo()
	{
		System.out.println("In base CLass Consturctor");
		x=10;
		y=20;
	}
	
	public void add()
	{
		System.out.println("Addition is " + (x+y));
	}
	
}
