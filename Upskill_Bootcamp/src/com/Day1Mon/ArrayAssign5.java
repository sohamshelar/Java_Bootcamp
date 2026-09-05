package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[n];
		int arr2=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[arr.length-1-i];
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("array 2 "+ arr1[i] );
		}
	}

}
