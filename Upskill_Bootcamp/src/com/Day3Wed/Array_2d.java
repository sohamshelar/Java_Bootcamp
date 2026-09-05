package com.Day3Wed;

import java.util.Scanner;

public class Array_2d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Enter number for 3x3 matrix");
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
			System.out.println();
		}
	}
}
