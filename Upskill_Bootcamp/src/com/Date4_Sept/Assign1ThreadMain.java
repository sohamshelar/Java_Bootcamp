package com.Date4_Sept;

public class Assign1ThreadMain {
	public static void main(String[] args) {
		Assign1thread t1=new Assign1thread("N");
		Assign1thread t2=new Assign1thread("C");
		t1.setName("Number");
		t2.setName("Character");
		t1.start();
		t2.start();
		
	}
}
