package com.Day1Mon;

import java.util.Scanner;

public class ArrayExample {
	
	public static void main(String[] args) {
		int a[] =new int[5];
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements to store");
		int n=sc.nextInt();
		for(int i=0 ; i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(" "+ a[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			
		}
		
		float avg=sum/n;
		
		System.out.println("Avg of array element is "+ avg);
		
		//Searching and updating array values;
		System.out.println("Enter number to search in array");
		int search=sc.nextInt();
		
		System.out.println("Enter new value to update ");
		int newval=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == search)
			{
				a[i]=newval;
			}
		}
		System.out.println("after update");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("array values = " +a[i]);
		}
	}
}
