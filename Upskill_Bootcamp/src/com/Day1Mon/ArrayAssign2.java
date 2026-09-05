package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			
			int a[]=new int[n];
			
			System.out.println("Enter numbers");
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			
			boolean f=false; 
			
			System.out.println("Enter Element to search in array");
			int se=sc.nextInt();
			for(int i=0;i<a.length;i++)
			{
				if(a[i] == se)
				{
					f=true;
					break;
				}
			}	
			if(f)
			{
				System.out.println("Element found");
			}
			else
			{
				System.out.println("Element not found");
			}
	}
			
}

