package com.demo;

import java.util.Scanner;

public class ForLoop {
	
	public static int Fact(int num)
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		return f;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number to print table");
//		int n=sc.nextInt();
//		int i=0;
//		for(i=1;i<=10;i++)
//		{
//			int m=n*i;
//			System.out.println(n+"*"+i+"="+m);
//		}
		System.out.println("Enter number for factorial");
		int num=sc.nextInt();
		int facto=Fact(num);
		System.out.println("Factorial of the "+num+" is :"+facto);
		
		
		
		
	}
}
