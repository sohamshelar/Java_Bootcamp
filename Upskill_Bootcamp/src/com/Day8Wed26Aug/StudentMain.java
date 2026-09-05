package com.Day8Wed26Aug;

public class StudentMain {
	
	static
	{
		System.out.println("berfore main method");
	}
	public static void main(String[] args) {
		Student s1=new Student("Student1");
		Student s2=new Student("Student2");
		Student s3=new Student("Student3");
		Student s4=new Student("Student4");
		Student s5=new Student("Student5");
		Student s6=new Student();
		System.out.println("Total number of students =" + Student.getCnt());
		s1.display();
		s2.display();
	}
}
