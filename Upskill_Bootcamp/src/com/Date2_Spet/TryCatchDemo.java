package com.Date2_Spet;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchDemo {
	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		try
		{
			String s= null;
			int  a=Integer.parseInt(br.readLine());
			if(a<0)
			{
				throw new UserException("-ve values not allowed");
			}
			System.out.println(s.length());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Outside try catch block");
	}
}
