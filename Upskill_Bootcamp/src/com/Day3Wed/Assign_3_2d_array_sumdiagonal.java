package com.Day3Wed;

import java.util.Scanner;

public class Assign_3_2d_array_sumdiagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Enter elements for 3x3 matrix");
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
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i == j)
				{
					sum1 = sum1 + arr[i][j];
				}
				
				if(i + j == arr.length-1)
				{
					sum2 = sum2 + arr[i][j];
				}
			}
		}
			System.out.println("Sum of primary diagonal =" + sum1);
			System.out.println("Sum of secondary diagonal =" + sum2);
	}
}
