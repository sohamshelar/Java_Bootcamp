package com.Day4Thu20Aug;

import java.util.Scanner;

public class Assign2Account {
	String accountNo;
	String customerName;
	String balance;
	
	public void openAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No");
		accountNo=sc.next();
		System.out.println("Enter Customer Name");
		customerName=sc.nextLine();
		
	}
}
