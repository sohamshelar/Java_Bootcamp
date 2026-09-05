package com.Day4Thu20Aug;

public class Assign1Person {

	String name;
	String aadhar;
	String pan;
	String contact;
	String email;
	double annual_income;

	public Assign1Person(String name, String aadhar, String pan,
			String contact, String email, double annual_income) {

		this.name = name;
		this.aadhar = aadhar;
		this.pan = pan;
		this.contact = contact;
		this.email = email;
		this.annual_income = annual_income;
	}

	
	public void viewPersonData() {

		System.out.println("Person name = " + name);
		System.out.println("Aadhar number = " + aadhar);
		System.out.println("PAN no = " + pan);
		System.out.println("Contact no = " + contact);
		System.out.println("Email Id = " + email);
		System.out.println("Annual Income = " + annual_income);
		System.out.println("----------------------------");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAadhar() {
		return aadhar;
	}


	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}


	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
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


	public double getAnnual_income() {
		return annual_income;
	}


	public void setAnnual_income(double annual_income) {
		this.annual_income = annual_income;
	}
	
	
}