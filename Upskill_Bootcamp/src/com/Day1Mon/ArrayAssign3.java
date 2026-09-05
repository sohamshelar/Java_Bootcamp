package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign3 {
	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter Array Elements");
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			if(min > arr[i])
			{
				min=arr[i];
			}
		}
		
		System.out.println("Maximum number of array is " + max);
		System.out.println("Minimum number of array is " + min);
	}

}
