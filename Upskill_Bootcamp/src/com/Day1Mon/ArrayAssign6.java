package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int nonprime[]=new int[n];
		System.out.println("Enter array elements");
		/*for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		
		int k=0;
		int count = 0;
		
		for(int i=0;i<arr.length;)
		{
			count=0;
			int num=sc.nextInt();
			for(int j=2;j<num;j++)
			{
				if(num % j == 0)
				{
					count++;
					break;
				}
			}
			
			if(count>0)
			{
				nonprime[i]=num;
				System.out.println(i+" "+nonprime[i]);
				i++;
			}
		}	
		
		System.out.println("Array of non-prime numbers");
		
		for(int i=0;i<nonprime.length;i++)
		{
			System.out.println(nonprime[i]);
		}
		
	}
}
