package com.Date7_sept;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Assign1MainClass {
	
	
	public static void main(String[] args) {
		ArrayList<Assign1Customer> c1=new ArrayList<Assign1Customer>();
		c1.add(new Assign1Customer(1, "soham", "soham@gmail.com", "45678909876", "Satara"));
		c1.add(new Assign1Customer(2, "Omkar","omkar@gmail.com", "87654456876", "Pune"));
		c1.add(new Assign1Customer(3, "Rohit","rohit@gmail.com", "2454457699", "Satara"));
		
		ArrayList<Assign1Orders> o1=new ArrayList<Assign1Orders>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int ch=0;
		do
		{
			System.out.println("Select following Operation");
            System.out.println("1. Place Order");
            System.out.println("2. View All Orders of Given Customer");
            System.out.println("3. Update Status");
            System.out.println("4. View All Delivered Orders of Given Customer");
            System.out.println("5. Delete Order");
            System.out.println("6. Display Customer Names for Given Item");
            System.out.println("7. Check Status of Given Order");
            System.out.println("8. Exit");
            
            System.out.println("Enter your choice");

			try {
				
				ch=Integer.parseInt(br.readLine());
				switch(ch)
				{
				case 1:
					
				}
				
			}catch(Exception e) {
				
			}
			System.out.println("Select following opreations \n 1.Place order");
		}while(ch!=8);	
	}
	public static void placeOrder()
	{
		System.out.println("Enter Customer Id");
		int cid=Integer.parseInt()
	}
	
}
