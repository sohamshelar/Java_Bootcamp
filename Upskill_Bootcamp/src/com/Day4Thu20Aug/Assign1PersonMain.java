package com.Day4Thu20Aug;

import java.util.Scanner;

public class Assign1PersonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Assign1Person p1 = new Assign1Person(
				"Soham",
				"111122223333",
				"ABCDE1234F",
				"9876543210",
				"soham@gmail.com",
				350000
		);
		
		p1.viewPersonData();

		Assign1Person p2 = new Assign1Person(
				"Ram",
				"222233334444",
				"BCDEF2345G",
				"9876501234",
				"ram@gmail.com",
				550000
		);
		
		p2.viewPersonData();

		Assign1Person p3 = new Assign1Person(
				"Sham",
				"333344445555",
				"CDEFG3456H",
				"9876512345",
				"sham@gmail.com",
				750000
		);
		
		p3.viewPersonData();

		System.out.println("Enter name to search:");
		String searchName = sc.next();

		System.out.println("Enter Aadhar to search:");
		String searchAadhar = sc.next();

		if (p1.name.equals(searchName) && p1.aadhar.equals(searchAadhar)) {
			System.out.println("Person Found");
			p1.viewPersonData();
		}
		else if (p2.name.equals(searchName) && p2.aadhar.equals(searchAadhar)) {
			System.out.println("Person Found");
			p2.viewPersonData();
		}
		else if (p3.name.equals(searchName) && p3.aadhar.equals(searchAadhar)) {
			System.out.println("Person Found");
			p3.viewPersonData();
		}
		else {
			System.out.println("Person Not Found");
		}

		System.out.println("Enter Aadhar to update contact:");
		String updateAadhar = sc.next();

		System.out.println("Enter Email:");
		String updateEmail = sc.next();

		System.out.println("Enter new contact number:");
		String newContact = sc.next();

		if (p1.aadhar.equals(updateAadhar) && p1.email.equals(updateEmail)) {
			p1.contact = newContact;
			System.out.println("Contact updated successfully");
			p1.viewPersonData();
		}
		else if (p2.aadhar.equals(updateAadhar) && p2.email.equals(updateEmail)) {
			p2.contact = newContact;
			System.out.println("Contact updated successfully");
			p2.viewPersonData();
		}
		else if (p3.aadhar.equals(updateAadhar) && p3.email.equals(updateEmail)) {
			p3.contact = newContact;
			System.out.println("Contact updated successfully");
			p3.viewPersonData();
		}
		else {
			System.out.println("Invalid Aadhar or Email");
		}

		System.out.println("Persons having annual income greater than 4 Lakhs:");

		if (p1.annual_income > 400000) {
			p1.viewPersonData();
		}

		if (p2.annual_income > 400000) {
			p2.viewPersonData();
		}

		if (p3.annual_income > 400000) {
			p3.viewPersonData();
		}

		sc.close();
	}
}