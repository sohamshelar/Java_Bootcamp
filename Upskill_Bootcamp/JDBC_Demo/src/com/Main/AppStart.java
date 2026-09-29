package com.Main;

import java.util.List;
import java.util.Scanner;

import com.db.ConnectDb;
import com.db.EmpDb;
import com.pojo.Employee;

public class AppStart {
	public static void main(String[] args) {
		ConnectDb.createconnect();
		EmpDb ed =new EmpDb();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("1. Display All Records");
			System.out.println("2. Add Record");
			System.out.println("3. Update Record");
			System.out.println("4. Delete Record");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				List<Employee> elist=ed.getRecords();
				for(Employee em:elist)
				{
					System.out.println(em);
				}
				
				break;
				
			case 2:
				
				System.out.println("Enter Empno");
				int empno=sc.nextInt();
				
				System.out.println("Enter Employee name");
				String ename=sc.next();
				
				System.out.println("Enter Sal");
				double sal=sc.nextDouble();
				
				System.out.println("Enter Job");
				String job=sc.next();
				
				int cnt=ed.addRecord(new Employee(empno, ename, sal, job));
				if(cnt>0)
				{
					System.out.println("Record added successfully");
				}
				else
				{
					System.out.println("Some error");
				}
				
				break;
				
			case 3:
				
			    System.out.print("Enter Employee Number to update: ");
			    int uempno = sc.nextInt();

			    System.out.print("Enter New Employee Name: ");
			    String uename = sc.next();

			    System.out.print("Enter New Salary: ");
			    double usal = sc.nextDouble();

			    System.out.print("Enter New Job: ");
			    String ujob = sc.next();

			    int cnt1 = ed.updateRecord(
			            new Employee(uempno, uename, usal, ujob)
			    );

			    if(cnt1 > 0) {
			        System.out.println("Record updated successfully");
			    }
			    else {
			        System.out.println("Some error");
			    }
			    break;
			    
			case 4:
					System.out.println("Enter empno to delete");
					int empno1=sc.nextInt();
					
					int cnt3=ed.deleteRecord(empno1);
				
					if(cnt3>0)
					{
						System.out.println("Record Deleted successfully");
					}
					else
					{
						System.out.println("Some error");
					}
					
				break;
			    
			case 5:
                System.out.println("Thank you!");
                break;
                
			 default:
	                System.out.println("Invalid choice");
	            }   
				
		}while(choice != 5);
		
	}
}
