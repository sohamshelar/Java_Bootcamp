package com.Date4_Sept;

public class CustomerMain {
	public static void main(String[] args) throws InterruptedException {

        Customer c1 = new Customer("Customer 1");
        Customer c2 = new Customer("Customer 2");
        Customer c3 = new Customer("Customer 3");
        Customer c4 = new Customer("Customer 4");

        c1.start();
        c1.join();

        c2.start();
        c2.join();

        c3.start();
        c3.join();

        c4.start();
        c4.join();

        System.out.println("\nAll customers processed.");
    }
}
