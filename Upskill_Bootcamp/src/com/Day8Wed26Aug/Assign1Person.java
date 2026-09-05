package com.Day8Wed26Aug;

public class Assign1Person {
	private String name;
	private String contact;
	private String email;
	
	public Assign1Person(String name,String contact,String email)
	{
		this.name=name;
		this.contact=contact;
		this.email=email;
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
	
	public void display()
	{
		System.out.println("Person name =" + name);
		System.out.println("Contact no =" + contact);
		System.out.println("Email ID = " + email);
	}
}
