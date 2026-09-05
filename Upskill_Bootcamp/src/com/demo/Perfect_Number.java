package com.demo;

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=1;
		System.out.println("Enter number to check perfect number");
		int n=sc.nextInt();
		
		for(int i=2; i<n ; i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+"is perfect number");
		}
		else
		{
			System.out.println(n+"Number is not perfect");
		}
		
	}
}
