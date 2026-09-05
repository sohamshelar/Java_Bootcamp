package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign10 {
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
		
		int max=arr[0];
		int secmax=arr[0];
		
		int min=arr[0];
		int secmin=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max=arr[i];
			}
			
			if(min > arr[i])
			{
				min=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(secmax == max || arr[i] > secmax)
			{
				secmax=arr[i];
			}
			if(secmin == min || arr[i] < secmin)
			{
				secmin=arr[i];
			}
		}
		System.out.println("Second max number = " + secmax);
		System.out.println("Second min number = " + secmin);
		
		
	}
}
