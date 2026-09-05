package com.Day3Wed;

import java.util.Scanner;

public class Assign_4_2D_FindNum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Enter array elements for 3x3 matrix");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				 System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		boolean found=false;
		System.out.println("Enter number to search");
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] == num)
				{
					found=true;
				}
			}
		}
		
		if(found)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}

