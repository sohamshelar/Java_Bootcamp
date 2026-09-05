package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				arr[i] = 0;
			}
			else
			{
				arr[i] = 1;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array = "+ arr[i]);
		}
	}
}
