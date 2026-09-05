package com.Day8Wed26Aug;

public class Derived2 extends Derived1{
	int m;
	int n;
	public Derived2(int a,int b,int x,int y,int m,int n)
	{
		super(a,b,x,y);
		this.m=m;
		this.n=n;
	}
	public void display()
	{
		System.out.println(" m =" + m);
		System.out.println(" n =" + n);
		super.display();
	}

}
