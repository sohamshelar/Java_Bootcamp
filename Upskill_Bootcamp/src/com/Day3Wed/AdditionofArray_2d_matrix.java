package com.Day3Wed;

import java.util.Scanner;

public class AdditionofArray_2d_matrix {
	public static void main(String[] args) {
		int a1[][]=new int[3][3];
		int a2[][]=new int[3][3];
		int a3[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number for 1st 3x3 matrix");
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter number for 2nd 3x3 matrix");
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				a2[i][j]=sc.nextInt();
			}
		}
		
		
		
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				a3[i][j]=a1[i][j] + a2[i][j];
			}
		}
		
		for(int i=0;i<a3.length;i++)
		{
			for(int j=0;j<a3[i].length;j++)
			{
				System.out.print(" "+ a3[i][j]);
			}
			System.out.println();
		}
	}
}
