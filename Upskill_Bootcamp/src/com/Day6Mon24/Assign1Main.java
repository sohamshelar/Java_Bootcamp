package com.Day6Mon24;

import java.util.Scanner;

public class Assign1Main {
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
		
		Assign1ArrayOpreations o1=new Assign1ArrayOpreations();
		System.out.println("Enter number to search ");
		int num=sc.nextInt();
		boolean result=o1.search(arr, num);
		if(result == true)
		{
			System.out.println("Number found");
		}
		else
		{
			System.out.println("Number not found");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		String str1[]= {"Soham","Omkar","Ram","Sham","Rohit"};
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		
		System.out.println("Enter String to search");
		String str=sc.next();
		boolean r1=o1.search(str1, str);
		if(r1==true)
		{
			System.out.println("String Found");
		}
		else
		{
			System.out.println("String not found");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		
		o1.sumOfArray(arr);
		
		
		System.out.println("---------------------------------------------------------------");
		
		char ch[]= {'A','B','C'};
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		o1.sumOfArray(ch);
	}
}
