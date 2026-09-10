package com.Date10_Sept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ProductManagement {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Product> products = new ArrayList<>();

    // 1. Add New Product
    static void addProduct() {

        System.out.println("\n===== ENTER COMPANY DETAILS =====");

        System.out.print("Enter Company ID: ");
        int companyId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Company Name: ");
        String companyName = sc.nextLine();

        System.out.print("Enter Company Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Company Contact: ");
        String contact = sc.nextLine();

        Company company = new Company(
                companyId,
                companyName,
                email,
                contact
        );

        System.out.println("\n===== ENTER PRODUCT DETAILS =====");

        System.out.print("Enter Product Code: ");
        int productCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Manufacturing Date (dd-MM-yyyy): ");
        String mfDate = sc.nextLine();

        System.out.print("Enter Expiry Date (dd-MM-yyyy): ");
        String expDate = sc.nextLine();

        System.out.print("Enter Available Quantity: ");
        int availableQty = sc.nextInt();

        Product product = new Product(
                productCode,
                name,
                price,
                mfDate,
                expDate,
                availableQty,
                company
        );

        products.add(product);

        System.out.println("Product added successfully!");
    }

    // 2. Search Product By Name
    static void searchByName() {

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Product p : products) {

            if (p.name.equalsIgnoreCase(name)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }

    // Search Product By Code
    static void searchByCode() {

        System.out.print("Enter Product Code: ");
        int code = sc.nextInt();

        boolean found = false;

        for (Product p : products) {

            if (p.productCode == code) {
                System.out.println(p);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }

    // Search Product By Name And Company
    static void searchByNameAndCompany() {

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Company Name: ");
        String companyName = sc.nextLine();

        boolean found = false;

        for (Product p : products) {

            if (p.name.equalsIgnoreCase(name)
                    && p.company.companyName.equalsIgnoreCase(companyName)) {

                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }

    // 3. Arrange Product By Name
    static void sortByName() {

        Collections.sort(products, new Comparator<Product>() {

            public int compare(Product p1, Product p2) {
                return p1.name.compareToIgnoreCase(p2.name);
            }
        });

        System.out.println("\nProducts arranged by Name:");

        displayProducts();
    }

    // Arrange Product By Code
    static void sortByCode() {

        Collections.sort(products, new Comparator<Product>() {

            public int compare(Product p1, Product p2) {
                return p1.productCode - p2.productCode;
            }
        });

        System.out.println("\nProducts arranged by Code:");

        displayProducts();
    }

    // 4. Remove Expired Products
    static void removeExpiredProducts() {

        String today = "10-09-2026";

        Iterator<Product> iterator = products.iterator();

        boolean removed = false;

        while (iterator.hasNext()) {

            Product p = iterator.next();

            if (p.expDate.compareTo(today) < 0) {

                iterator.remove();

                System.out.println(
                        "Expired product removed: " + p.name
                );

                removed = true;
            }
        }

        if (!removed) {
            System.out.println("No expired products found.");
        }
    }

    // Display All Products
    static void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== PRODUCT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add New Product");
            System.out.println("2. Search Product By Name");
            System.out.println("3. Search Product By Code");
            System.out.println("4. Search Product By Name And Company");
            System.out.println("5. Arrange Product By Name");
            System.out.println("6. Arrange Product By Code");
            System.out.println("7. Remove Expired Product");
            System.out.println("8. Display All Products");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    searchByName();
                    break;

                case 3:
                    searchByCode();
                    break;

                case 4:
                    searchByNameAndCompany();
                    break;

                case 5:
                    sortByName();
                    break;

                case 6:
                    sortByCode();
                    break;

                case 7:
                    removeExpiredProducts();
                    break;

                case 8:
                    displayProducts();
                    break;

                case 9:
                    System.out.println("Program ended.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
