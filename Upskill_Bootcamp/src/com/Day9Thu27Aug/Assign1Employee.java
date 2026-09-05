package com.Day9Thu27Aug;

public class Assign1Employee extends Assign1Person{
	
	  int empno;
	    double basic_salary;
	    double allowances;
	    double taxamount;

	    public double calculateSalary() {
	        return basic_salary + allowances - taxamount;
	    }

	    public void viewSalarySlip() {
	        System.out.println("\n----- Salary Slip -----");
	        System.out.println("Employee No     : " + empno);
	        System.out.println("Basic Salary    : " + basic_salary);
	        System.out.println("Allowances      : " + allowances);
	        System.out.println("Tax Amount      : " + taxamount);
	        System.out.println("Net Salary      : " + calculateSalary());
	    }

	    @Override
	    public void viewInfo() {
	        System.out.println("\n----- Employee Information -----");
	        System.out.println("Employee No : " + empno);
	        System.out.println("Name        : " + name);
	        System.out.println("Contact     : " + contact);
	        System.out.println("Email       : " + email);
	        System.out.println("City        : " + city);
	        System.out.println("Pincode     : " + pincode);
	    }

}
