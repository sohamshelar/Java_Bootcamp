package com.Date5_Sept;

public class Orders {
	int qty;
	boolean available;
	public Orders() {
		qty=10;
		available=true;
	}
	synchronized public void supplyItem() {
		while(available) {
			try {
				System.out.println(Thread.currentThread().getName()+ "Supplier waiting ");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		qty=10;
		System.out.println(" Item available  "+qty);
		available=true;
		notifyAll();
	}
	synchronized public void getItem(int required_qty) {
		while(!available) {
			try {
				System.out.println(Thread.currentThread().getName()+ "customer waiting ");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Current Available quantity= "+qty+" "+ Thread.currentThread().getName()+" Customer required quantity is "+required_qty);
		if(qty<required_qty) {
			System.out.println(" Not sufficient quantity");
		}
		else {
			qty=qty-required_qty;
			System.out.println("Current Available quantity= "+qty);
			if(qty<=0) {
				System.out.println("Available quantity= "+qty);
				available=false;				
				notifyAll();
			}
			
		}
	}
}
