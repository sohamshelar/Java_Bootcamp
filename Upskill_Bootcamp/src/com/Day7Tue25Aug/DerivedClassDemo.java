package com.Day7Tue25Aug;

public class DerivedClassDemo extends BaseClassDemo{
	int a;
	int b;
	
	public DerivedClassDemo()
	{
		System.out.println("In Derived Class Consturctor");
		a=30;
		b=20;
	}
	
	public void mult()
	{
		System.out.println("Multiplication is  " +(a*b*x*y));
	}
}
