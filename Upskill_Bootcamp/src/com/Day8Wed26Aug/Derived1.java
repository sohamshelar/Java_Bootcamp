package com.Day8Wed26Aug;

public class Derived1 extends Base{
	int x;
	int y;
	
	public Derived1(int x,int y,int a,int b)
	{
		super(a,b);
		this.x=x;
		this.y=y;
	}
	
	public void display()
	{
		System.out.println(" x =" + x);
		System.out.println(" y =" + y);
		super.display();
	}
}
