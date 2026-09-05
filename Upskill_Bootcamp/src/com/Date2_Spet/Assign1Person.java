package com.Date2_Spet;

import java.util.Scanner;

public class Assign1Person {
	
		    int personId;
		    String personName;
		    String email;
		    String contact;
		    String username;
		    String password;
		    
		    public Assign1Person(int personId ,String personName, String email,String contact,String username,String password) throws Assign1RegistrationException
		    {
		    	if(username.length() < 8 || username.length() > 16)
		    	{
		    		throw new Assign1RegistrationException("username must be between 8 to 16 characters");
		    	}
		    	
		    	if(password.length() < 16 || password.length() > 30)
		    	{
		    		throw new Assign1RegistrationException("password must be between 16 to 30 characters");
		   
		    	}
		    	
		    	 this.personId = personId;
		         this.personName = personName;
		         this.email = email;
		         this.contact = contact;
		         this.username = username;
		         this.password = password;
		    	
		    }
		    
		    
		    public void viewInfo() {

		        System.out.println("-----------------------------");
		        System.out.println("Person ID   : " + personId);
		        System.out.println("Person Name : " + personName);
		        System.out.println("Email       : " + email);
		        System.out.println("Contact     : " + contact);
		        System.out.println("Username    : " + username);
		        System.out.println("Password    : " + password);
		        System.out.println("-----------------------------");
		    }
		    
}
