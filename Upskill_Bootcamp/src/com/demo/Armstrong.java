package com.demo;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem=0,sum=0,rev=1;
		System.out.println("Enter number to check Armstrong or not");
		int num=sc.nextInt();
		int org=num;
		
		while(num>0)
		{
			rem=num % 10;
			rev=rem*rem*rem;
			sum=sum + rev ;
			num=num/10;
			
		}
		System.out.println(sum);
		if(sum == org)
		{
			System.out.println(sum + "is Armstrong");
		}
		else
		{
			System.out.println("not Armstrong ");
		}
		
		
	}
}
