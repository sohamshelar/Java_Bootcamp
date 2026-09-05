package com.Date5_Sept;

public class Supplier extends Thread{
	String sname;
	Orders ob;
	
	public Supplier(String sname, Orders ob) {
		super();
		this.sname = sname;
		this.ob = ob;
	}

	public void run() {
		while(true)
			ob.supplyItem();
	}
}
