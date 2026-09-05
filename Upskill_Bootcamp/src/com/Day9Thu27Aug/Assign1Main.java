package com.Day9Thu27Aug;

import java.util.Scanner;

public class Assign1Main {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Assign1Employee emp = new Assign1Employee();

	        
	        System.out.println("Enter Employee Details");

	        System.out.print("Enter Name: ");
	        emp.name = sc.nextLine();

	        System.out.print("Enter Contact: ");
	        emp.contact = sc.nextLine();

	        System.out.print("Enter Email: ");
	        emp.email = sc.nextLine();

	        System.out.print("Enter City: ");
	        emp.city = sc.nextLine();

	        System.out.print("Enter Pincode: ");
	        emp.pincode = sc.nextInt();

	        
	        System.out.print("Enter Employee Number: ");
	        emp.empno = sc.nextInt();

	        System.out.print("Enter Basic Salary: ");
	        emp.basic_salary = sc.nextDouble();

	        System.out.print("Enter Allowances: ");
	        emp.allowances = sc.nextDouble();

	        System.out.print("Enter Tax Amount: ");
	        emp.taxamount = sc.nextDouble();

	       
	        Assign1Person p = emp;

	        int choice;

	        do {
	            System.out.println("1. View Person Information");
	            System.out.println("2. View Salary Slip");
	            System.out.println("3. View Employee Information");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            System.out.println("\n========== MENU ==========");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    
	                    p.viewInfo();
	                    break;

	                case 2:
	                    emp.viewSalarySlip();
	                    break;

	                case 3:
	                   
	                    p.viewInfo();
	                    break;

	                case 4:
	                    System.out.println("Program Ended.");
	                    break;

	                default:
	                    System.out.println("Invalid Choice!");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	
}
