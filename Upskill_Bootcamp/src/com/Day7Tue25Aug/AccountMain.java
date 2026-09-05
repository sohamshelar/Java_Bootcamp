package com.Day7Tue25Aug;

import java.util.Scanner;

public class AccountMain {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Account Number:");
	        int accountNumber = sc.nextInt();

	        System.out.println("Enter Customer ID:");
	        int customerId = sc.nextInt();

	        System.out.println("Enter Customer Name:");
	        String customerName = sc.next();

	        System.out.println("Enter Initial Balance:");
	        double balance = sc.nextDouble();

	        System.out.println("Enter Interest Rate:");
	        double interestRate = sc.nextDouble();

	        System.out.println("Enter Amount Allowed to Withdraw at a Time:");
	        double amountAllowedToWithdraw = sc.nextDouble();

	        System.out.println("Enter Total Transactions Allowed in a Day:");
	        int totalTransactionsAllowed = sc.nextInt();

	        SavingAccount account = new SavingAccount(
	                accountNumber,
	                customerId,
	                customerName,
	                balance,
	                interestRate,
	                amountAllowedToWithdraw,
	                totalTransactionsAllowed
	        );

	        int choice;

	        do {
	            System.out.println("\n===== SAVING ACCOUNT MENU =====");
	            System.out.println("1. Display Account Details");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Check Balance");
	            System.out.println("5. Exit");

	            System.out.println("Enter your choice:");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    account.displaySavingAccountDetails();
	                    break;

	                case 2:
	                    System.out.println("Enter amount to withdraw:");
	                    double withdrawAmount = sc.nextDouble();

	                    account.withdraw(withdrawAmount);
	                    break;

	                case 3:
	                    System.out.println("Enter amount to deposit:");
	                    double depositAmount = sc.nextDouble();

	                    account.deposit(depositAmount);
	                    break;

	                case 4:
	                    account.checkBalance();
	                    break;

	                case 5:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }

	        } while (choice != 5);

	        sc.close();
	    }
}
