package com.Day7Tue25Aug;

public class Account
{
	int accountNumber;
    int customerId;
    String customerName;
    double balance;

    public Account(int accountNumber, int customerId, String customerName, double balance) 
    {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void displayAccountDetails() 
    {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer ID    : " + customerId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Balance        : " + balance);
    }
}

