package com.Date10_Sept;

public class Company {
	 int companyId;
	    String companyName;
	    String email;
	    String contact;

	    Company(int companyId, String companyName, String email, String contact) {
	        this.companyId = companyId;
	        this.companyName = companyName;
	        this.email = email;
	        this.contact = contact;
	    }

	    public String toString() {
	        return companyId + " - " + companyName;
	    }
}

