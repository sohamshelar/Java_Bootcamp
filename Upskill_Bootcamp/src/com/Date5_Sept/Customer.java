package com.Date5_Sept;

public class Customer extends Thread {
	String cname;
	int required_qty;
	Orders obj;
	
	public Customer(String cname, int required_qty, Orders obj) {
		super();
		this.cname = cname;
		this.required_qty = required_qty;
		this.obj = obj;
	}

	public void run() {
		for(int j=0;j<=3;j++)
			obj.getItem(required_qty);
	}

}
