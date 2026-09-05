package com.Day6Mon24;

public class CalculatorOverloading {
		public void add(int a,int b)
		{
			System.out.println("Addition is "+ (a+b));
		}
		
		public void add(float a,float b)
		{
			System.out.println("Addition is "+ (a+b));
		}
		
		public void add(int a)
		{
			a+=10;
			System.out.println("Addition is "+ a);
		}
}
