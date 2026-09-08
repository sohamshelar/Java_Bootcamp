package com.Date8_Sept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Assign1MainClass {
	
	public static void searchByRollNo(HashSet<Assign1Student> hs,BufferedReader br) throws IOException
	{
		System.out.println("Enter Roll no to search");
		int rollno=Integer.parseInt(br.readLine());
		
		boolean found=false;
		
		for(Assign1Student s: hs)
		{
			if(s.getRollno()==rollno)
			{
				System.out.println(s);
				found=true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("Student not found");
		}
	}
	
	public static void DeleteStudent(HashSet<Assign1Student> hs,BufferedReader br) throws IOException
	{
		
		System.out.println("Enter roll no to delete student");
		int rollno=Integer.parseInt(br.readLine());
		
		Assign1Student student=null;
		for(Assign1Student s : hs)
		{
			if(s.getRollno() == rollno)
			{
				student = s;
				break;
			}
		}
		
		if(student != null)
		{
			hs.remove(student);
			System.out.println("Student deleted Sccessfully");
		}
		else
		{
			System.out.println("Student not found");
		}
	}
	
	public static void DisplayAllStudents(HashSet<Assign1Student> hs)
	{
		for(Assign1Student s1: hs)
		{
			System.out.println(s1);
		}
	}
	
	public static void updateComputerMarks(HashSet<Assign1Student> hs,
			BufferedReader br) throws IOException {

		System.out.print("Enter Roll No: ");
		int rollno = Integer.parseInt(br.readLine());

		Assign1Student student = null;

		for (Assign1Student s : hs) {

			if (s.getRollno() == rollno) {

				student = s;
				break;
			}
		}

		if (student != null) {

			System.out.print("Enter New Computer Marks: ");
			double marks = Double.parseDouble(br.readLine());

			student.setCom_marks(marks);


			double percentage =
					(student.getPhy_marks()
					+ student.getMath_marks()
					+ student.getChem_marks()
					+ student.getCom_marks()) / 4;

			student.setPer(percentage);


			String grade;

			if (percentage >= 90) {
				grade = "A+";
			}
			else if (percentage >= 80) {
				grade = "A";
			}
			else if (percentage >= 70) {
				grade = "B";
			}
			else if (percentage >= 60) {
				grade = "C";
			}
			else if (percentage >= 50) {
				grade = "D";
			}
			else {
				grade = "F";
			}

			student.setGrade(grade);

			System.out.println("Computer marks updated successfully.");

			System.out.println(student);

		} else {

			System.out.println("Student not found.");
		}
	}
	
	public static void displayTopper(HashSet<Assign1Student> hs) {

		Assign1Student topper = null;

		for (Assign1Student s : hs) {

			if (topper == null ||
					s.getPer() > topper.getPer()) {

				topper = s;
			}
		}

		if (topper != null) {

			System.out.println("\n===== TOPPER STUDENT =====");
			System.out.println(topper);

		} else {

			System.out.println("No student available.");
		}
	}
	
	// 6. Display Fail Students
		public static void displayFailStudents(HashSet<Assign1Student> hs) {

			boolean found = false;

			System.out.println("\n===== FAIL STUDENTS =====");

			for (Assign1Student s : hs) {

				if (s.getPer() < 50) {

					System.out.println(s);
					found = true;
				}
			}

			if (!found) {

				System.out.println("No student has failed.");
			}
		}
	
	
	public static void main(String[] args) throws IOException{
		
		HashSet<Assign1Student> hs=new HashSet<Assign1Student>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		hs.add(new Assign1Student(1, "Rohit", "9876543210",85, 90, 78, 88, 85.25, "A"));

		hs.add(new Assign1Student(2, "Rahul", "9876543211",75, 82, 80, 79, 79.00, "B"));

		hs.add(new Assign1Student(3, "Soham", "9876543212",92, 88, 95, 90, 91.25, "A+"));

		hs.add(new Assign1Student(4, "Omkar", "9876543213",68, 72, 65, 70, 68.75, "B"));

		hs.add(new Assign1Student(5, "Ram", "9876543214",80, 85, 82, 86, 83.25, "A"));
		
		int choice;
		
		do
		{
			System.out.println();
			System.out.println("1. Search Student by Roll No");
			System.out.println("2. Delete Student");
			System.out.println("3. Display All Students");
			System.out.println("4. Update Computer Marks");
			System.out.println("5. Display Topper Student");
			System.out.println("6. Display Fail Student List");
			System.out.println("7. Exit");
			
			System.out.println("Enter your Choice");
			choice=Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:
				searchByRollNo(hs, br);
				break;
				
			case 2:
				DeleteStudent(hs, br);
				break;
				
			case 3:
				DisplayAllStudents(hs);
				break;
				
			case 4:
				updateComputerMarks(hs, br);
				break;
			
			case 5:
				displayTopper(hs);
				break;
				
			case 6:
				displayFailStudents(hs);
				break;
				
			default:
				System.out.println("Invalid choice.");
			}

		}while(choice != 7);
	}
	
}


