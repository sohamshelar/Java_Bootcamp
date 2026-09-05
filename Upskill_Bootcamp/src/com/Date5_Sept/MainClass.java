package com.Date5_Sept;

public class MainClass {
	public static void main(String[] args) {
		Orders od=new Orders();
		Customer c1=new Customer("Soham", 3, od);
		c1.setName("Soham");
		Customer c2=new Customer("Omkar", 5, od);
		c2.setName("Omkar");
		Customer c3=new Customer("Akash", 5, od);
		c3.setName("Akash");
		Supplier s1=new Supplier("Supplier1", od);
		c1.start();
		c2.start();
		c3.start();
		s1.start();
	}
}
