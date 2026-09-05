package com.demo;

import java.util.Scanner;

public class Reverse_Number {
	
	public static void main(String[] args) {
		int sum=1,rev=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to reverse it");
		int num=sc.nextInt();
		while(num>0)
		{
			rev=num % 10;
			num=num/10;
			if(rev % 2==0)
			{
			System.out.println(rev);
			}
		}
				}

}
