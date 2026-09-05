package com.Day4Thu20Aug;

import java.util.Scanner;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1=new Student(); // Object creation 
		s1.registerStudent();// access method for object 
		s1.viewProfile(); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id");
		int sid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name");
		String name=sc.nextLine();
		System.out.println("Enter student contact number");
		String contact=sc.nextLine();
		System.out.println("Enter email of the student");
		String email=sc.nextLine();
		
		Student s2=new Student(sid,name,contact,email);
		s2.viewProfile();
		

		System.out.println("Enter student id to search");
		int id=sc.nextInt();
		if(id == s1.sid)
		{
			s1.viewProfile();
		}
		else if(id == s2.sid)
		{
			s2.viewProfile();
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
