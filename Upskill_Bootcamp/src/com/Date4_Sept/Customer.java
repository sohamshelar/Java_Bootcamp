package com.Date4_Sept;
import java.util.Scanner;

class Customer extends Thread {

    String customerName;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    public void run() {

    	Scanner sc=new Scanner(System.in);

        System.out.println("\nCustomer: " + customerName);

        System.out.print("Do you want to place the order? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {

            System.out.println(customerName + " is placing the order...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(customerName + " order placed successfully.");

        } else {

            System.out.println(customerName + " cancelled the order.");
        }
    }
}
