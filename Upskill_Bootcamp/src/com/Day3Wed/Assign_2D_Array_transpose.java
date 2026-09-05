package com.Day3Wed;

import java.util.Scanner;

public class Assign_2D_Array_transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int arr1[][]=new int[3][3];
		
		System.out.println("Enter elements for the  1st 2d matrix");
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
				System.out.print(" "+ arr[i][j]);
			}
			System.out.println(" ");
		}
		
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				arr1[i][j]=arr[j][i];
			}
		}
		System.out.println("Array traspose");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(" "+ arr1[i][j]);
			}
			System.out.println(" ");
		}
		
	}
}
