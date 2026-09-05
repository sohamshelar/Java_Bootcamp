package com.Day7Tue25Aug;

public class Assign1ScientificCalculator extends Assign1Calculator{
	int base=2;
	int exponent=5;
	
	public void power()
	{
		int result=1;
		for(int i =0;i<exponent;i++)
		{
			result= result * base;
		}
		System.out.println("Power is = "+ result);
	}
	
	
	
	public void factorial()
	{
		int n=5;
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=result * i;
		}
		
		System.out.println("Factorial is "+ result);
	}

}
