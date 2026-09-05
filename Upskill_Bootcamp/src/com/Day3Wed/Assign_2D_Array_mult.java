package com.Day3Wed;

import java.util.Scanner;

public class Assign_2D_Array_mult {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements for 1st 3x3 matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements for 2nd 3x3 matrix");
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<a.length;k++)
				{
					c[i][j]=c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("Matrix Multiplication");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("  "+c[i][j]);
			}
			System.out.println();
		}
	}
}
