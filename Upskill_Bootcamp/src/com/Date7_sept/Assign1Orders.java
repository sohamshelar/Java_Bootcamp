package com.Date7_sept;

public class Assign1Orders {
	private int orderid;
	private String date;
	private String name;
	private int quantity;
	private int price;
	private double bill_amount;
	private String status;
	private Assign1Customer c;
	public Assign1Orders(int orderid, String date, String name, int quantity, int price, double bill_amount,
			String status, Assign1Customer c) {
		super();
		this.orderid = orderid;
		this.date = date;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.bill_amount = bill_amount;
		this.status = status;
		this.c = c;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(double bill_amount) {
		this.bill_amount = bill_amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Assign1Customer getC() {
		return c;
	}
	public void setC(Assign1Customer c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Assign1Orders [orderid=" + orderid + ", date=" + date + ", name=" + name + ", quantity=" + quantity
				+ ", price=" + price + ", bill_amount=" + bill_amount + ", status=" + status + ", c=" + c + "]";
	}
	
	
}
