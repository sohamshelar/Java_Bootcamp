package com.Date8_Sept;

public class Assign1Student {
	private int rollno;
	private String name;
	private String contact;
	private double phy_marks;
	private double math_marks;
	private double chem_marks;
	private double com_marks;
	private double per;
	private String grade;
	
	public Assign1Student(int rollno, String name, String contact, double phy_marks, double math_marks,
			double chem_marks, double com_marks, double per, String grade) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.contact = contact;
		this.phy_marks = phy_marks;
		this.math_marks = math_marks;
		this.chem_marks = chem_marks;
		this.com_marks = com_marks;
		this.per = per;
		this.grade = grade;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public double getPhy_marks() {
		return phy_marks;
	}

	public void setPhy_marks(double phy_marks) {
		this.phy_marks = phy_marks;
	}

	public double getMath_marks() {
		return math_marks;
	}

	public void setMath_marks(double math_marks) {
		this.math_marks = math_marks;
	}

	public double getChem_marks() {
		return chem_marks;
	}

	public void setChem_marks(double chem_marks) {
		this.chem_marks = chem_marks;
	}

	public double getCom_marks() {
		return com_marks;
	}

	public void setCom_marks(double com_marks) {
		this.com_marks = com_marks;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Assign1Student [rollno=" + rollno + ", name=" + name + ", contact=" + contact + ", phy_marks="
				+ phy_marks + ", math_marks=" + math_marks + ", chem_marks=" + chem_marks + ", com_marks=" + com_marks
				+ ", per=" + per + ", grade=" + grade + "]";
	}
	
	
	
	
	
	
}
