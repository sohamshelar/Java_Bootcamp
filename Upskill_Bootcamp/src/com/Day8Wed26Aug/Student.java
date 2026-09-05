package com.Day8Wed26Aug;

public class Student {
	private static int cnt;
	private int rollno;
	private String name;
	
	static 
	{
		cnt=10;
	}
	public Student(String name)
	{
		this.rollno=cnt++;
		this.name=name;
	}
	public Student()
	{
		cnt++;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Student.cnt = cnt;
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
	
	public void display()
	{
		System.out.println("Roll No = "+ rollno);
		System.out.println("Name =" + name);
	}
}
