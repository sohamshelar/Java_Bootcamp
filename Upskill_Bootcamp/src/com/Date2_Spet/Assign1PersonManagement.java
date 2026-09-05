package com.Date2_Spet;

import java.util.Scanner;

public class Assign1PersonManagement {
	static Scanner sc =new Scanner(System.in);
	static Assign1Person p1[] =new Assign1Person[5];
	
	static int count=0;
	
	public static void registerPerson()
	{
		try
		{
			System.out.println("Enter person Id");
			int id =sc.nextInt();
			sc.nextLine();
			 System.out.print("Enter Person Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Email: ");
	            String email = sc.nextLine();

	            System.out.print("Enter Contact: ");
	            String contact = sc.nextLine();

	            System.out.print("Enter Username: ");
	            String username = sc.nextLine();

	            System.out.print("Enter Password: ");
	            String password = sc.nextLine();

	            Assign1Person p = new Assign1Person(
	                    id,
	                    name,
	                    email,
	                    contact,
	                    username,
	                    password
	            );

	            p1[count] = p;
	            count++;

	            System.out.println("Person registered successfully.");

	        } catch (Assign1RegistrationException e) {

	            System.out.println("Registration Error: "
	                    + e.getMessage());
	        }
	    }

	    public static Assign1Person validateUser()
	            throws Assign1AuthenticationException {

	        System.out.println("User Authentication");

	        System.out.print("Enter Username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();

	        for (int i = 0; i < count; i++) {

	            if (p1[i].username.equals(username)
	                    && p1[i].password.equals(password)) {

	                return p1[i];
	            }
	        }

	        throw new Assign1AuthenticationException(
	                "Invalid username or password");
	    }

	   
	    public static void searchByName() {

	        try {

	            validateUser();

	            System.out.print("Enter Person Name: ");
	            String name = sc.nextLine();

	            boolean found = false;

	            for (int i = 0; i < count; i++) {

	                if (p1[i].personName.equalsIgnoreCase(name)) {

	                    p1[i].viewInfo();

	                    found = true;
	                }
	            }

	            if (!found) {

	                throw new Assign1PersonNotFoundException(
	                        "Person not found");
	            }

	        } catch (Assign1AuthenticationException e) {

	            System.out.println("Authentication Error: "
	                    + e.getMessage());

	        } catch (Assign1PersonNotFoundException e) {

	            System.out.println("Search Error: "
	                    + e.getMessage());
	        }
	    }


	    public static void searchByEmail() {

	        try {

	            validateUser();

	            System.out.print("Enter Email: ");
	            String email = sc.nextLine();

	            boolean found = false;

	            for (int i = 0; i < count; i++) {

	                if (p1[i].email.equalsIgnoreCase(email)) {

	                    p1[i].viewInfo();

	                    found = true;
	                }
	            }

	            if (!found) {

	                throw new Assign1PersonNotFoundException(
	                        "Person not found");
	            }

	        } catch (Assign1AuthenticationException e) {

	            System.out.println("Authentication Error: "
	                    + e.getMessage());

	        } catch (Assign1PersonNotFoundException e) {

	            System.out.println("Search Error: "
	                    + e.getMessage());
	        }
	    }

	    public static void viewAllPersons() {

	        try {

	            validateUser();

	            System.out.println("All Person List");

	            for (int i = 0; i < count; i++) {

	                p1[i].viewInfo();
	            }

	        } catch (Assign1AuthenticationException e) {

	            System.out.println("Authentication Error: "
	                    + e.getMessage());
	        }
	    }

	    
	    public static void updateContact() {

	        try {

	            validateUser();

	            System.out.print("Enter Person ID: ");
	            int id = sc.nextInt();
	            sc.nextLine();

	            boolean found = false;

	            for (int i = 0; i < count; i++) {

	                if (p1[i].personId == id) {

	                    System.out.print("Enter New Contact: ");
	                    String contact = sc.nextLine();

	                    p1[i].contact = contact;

	                    System.out.println(
	                            "Contact updated successfully.");

	                    found = true;

	                    break;
	                }
	            }

	            if (!found) {

	                throw new Assign1PersonNotFoundException(
	                        "Person ID not found");
	            }

	        } catch (Assign1AuthenticationException e) {

	            System.out.println("Authentication Error: "
	                    + e.getMessage());

	        } catch (Assign1PersonNotFoundException e) {

	            System.out.println("Update Error: "
	                    + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        
	        while (count < 5) {

	            System.out.println(
	                    "Register Person " + (count + 1));

	            registerPerson();
	        }

	        int choice;

	        do {

	            System.out.println("1. Search Person by Name");
	            System.out.println("2. Search Person by Email");
	            System.out.println("3. View All Person List");
	            System.out.println("4. Update Contact");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    searchByName();
	                    break;

	                case 2:
	                    searchByEmail();
	                    break;

	                case 3:
	                    viewAllPersons();
	                    break;

	                case 4:
	                    updateContact();
	                    break;

	                case 5:
	                    System.out.println("Program Exited");
	                    break;

	                default:
	                    System.out.println("Invalid Choice");
	            }

	        } while (choice != 5);

	        sc.close();
	}
}

