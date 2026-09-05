package com.Day1Mon;

import java.util.Scanner;

public class Menu_Driven {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Find Power of a Given Number");
            System.out.println("2. Display Fibonacci Series");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the base: ");
                    int b = sc.nextInt();

                    System.out.print("Enter the exponent: ");
                    int e = sc.nextInt();

                    int p = 1;

                    for (int i = 1; i <= e; i++) {
                        p = p * b;
                    }

                    System.out.println("Power = " + p);
                    break;

                case 2:
                    System.out.print("Enter number of terms: ");
                    int n = sc.nextInt();

                    int a = 0, b1 = 1;

                    System.out.println("Fibonacci Series:");

                    for (int i = 1; i <= n; i++) {
                        System.out.print(a + " ");

                        int c = a + b1;
                        a = b1;
                        b1 = c;
                    }

                    System.out.println();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

    }
}

