package com.Day4Thu20Aug;

import java.util.Scanner;

public class Student {
	int sid;
	String name;
	String contact;
	String email;
	
	public Student()
	{
		
	}
	
	public Student(int s,String n,String c,String e)
	{
		sid=s;
		name=n;
		contact=c;
		email=e;
	}
	
	public void registerStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id");
		sid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name");
		name=sc.nextLine();
		System.out.println("Enter student contact number");
		contact=sc.nextLine();
		System.out.println("Enter email of the student");
		email=sc.nextLine();
	}
	
	public void viewProfile()
	{
		System.out.println(" Id =" +sid);
		System.out.println(" Name =" +name);
		System.out.println(" Contact =" +contact);
		System.out.println(" email =" +email);
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
