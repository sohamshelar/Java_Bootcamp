package com.Date7_sept;

public class Assign1Customer {
	private int c_id;
	private String name;
	private String email;
	private String contact;
	private String city;
	
	public Assign1Customer(int c_id, String name, String email, String contact, String city) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.city = city;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Assign1Customer [c_id=" + c_id + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", city=" + city + "]";
	}
	
	
}
