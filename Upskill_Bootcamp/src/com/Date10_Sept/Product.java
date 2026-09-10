package com.Date10_Sept;

public class Product {
	 int productCode;
	    String name;
	    double price;
	    String mfDate;
	    String expDate;
	    int availableQty;
	    Company company;

	    Product(int productCode, String name, double price,
	            String mfDate, String expDate, int availableQty,
	            Company company) {

	        this.productCode = productCode;
	        this.name = name;
	        this.price = price;
	        this.mfDate = mfDate;
	        this.expDate = expDate;
	        this.availableQty = availableQty;
	        this.company = company;
	    }

	    public String toString() {
	        return "Product Code: " + productCode +
	                ", Name: " + name +
	                ", Price: " + price +
	                ", MF Date: " + mfDate +
	                ", EXP Date: " + expDate +
	                ", Quantity: " + availableQty +
	                ", Company: " + company.companyName;
	    }
}
