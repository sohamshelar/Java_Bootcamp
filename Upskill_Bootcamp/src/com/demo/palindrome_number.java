package com.demo;

import java.util.Scanner;

public class palindrome_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem=0,sum=0;
		System.out.println("Enter number to check palindrome or not");
		int num=sc.nextInt();
		int org=num;
		
		while(num>0)
		{
			rem=num % 10;
			sum=sum * 10 + rem;
			num=num/10;
			
		}
		if(sum == org)
		{
			System.out.println(sum + "is Palindrome");
		}
		else
		{
			System.out.println("not palindrome ");
		}
		
		
	}
}
