package com.Day9Thu27Aug;

public class OverridingDerived extends OverridingBase {
	@Override
	public void display(String msg)
	{
		System.out.println(msg);
	}
	
	public void method()
	{
		System.out.println("In derived class method");
		super.method1();
	}
}
