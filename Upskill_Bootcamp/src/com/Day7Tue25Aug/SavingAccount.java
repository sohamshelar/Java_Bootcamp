package com.Day7Tue25Aug;

public class SavingAccount extends Account{
	  double interestRate;
	    double amountAllowedToWithdraw;
	    int totalTransactionsAllowed;
	    int transactionCount = 0;

	    public SavingAccount(int accountNumber, int customerId, String customerName,
	                         double balance, double interestRate,
	                         double amountAllowedToWithdraw,
	                         int totalTransactionsAllowed) {

	        super(accountNumber, customerId, customerName, balance);

	        this.interestRate = interestRate;
	        this.amountAllowedToWithdraw = amountAllowedToWithdraw;
	        this.totalTransactionsAllowed = totalTransactionsAllowed;
	    }

	    public void withdraw(double amount) {

	        if (transactionCount >= totalTransactionsAllowed) {
	            System.out.println("Daily transaction limit reached.");
	        }
	        else if (amount > amountAllowedToWithdraw) {
	            System.out.println("Withdrawal failed.");
	            System.out.println("You can withdraw maximum "
	                    + amountAllowedToWithdraw + " at a time.");
	        }
	        else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        }
	        else {
	            balance = balance - amount;
	            transactionCount++;

	            System.out.println("Amount withdrawn successfully.");
	            System.out.println("Withdrawn Amount : " + amount);
	            System.out.println("Remaining Balance: " + balance);
	        }
	    }

	    public void deposit(double amount) {

	        if (transactionCount >= totalTransactionsAllowed) {
	            System.out.println("Daily transaction limit reached.");
	        }
	        else if (amount <= 0) {
	            System.out.println("Invalid deposit amount.");
	        }
	        else {
	            balance = balance + amount;
	            transactionCount++;

	            System.out.println("Amount deposited successfully.");
	            System.out.println("Deposited Amount : " + amount);
	            System.out.println("New Balance      : " + balance);
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Current Balance : " + balance);
	    }

	    public void displaySavingAccountDetails() {

	        displayAccountDetails();

	        System.out.println("Interest Rate               : " + interestRate + "%");
	        System.out.println("Amount Allowed to Withdraw  : " + amountAllowedToWithdraw);
	        System.out.println("Total Transactions Allowed  : " + totalTransactionsAllowed);
	        System.out.println("Transactions Used Today     : " + transactionCount);
	    }
	
}
