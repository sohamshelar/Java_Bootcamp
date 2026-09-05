package com.Day9Thu27Aug;

public class OverridingMain {
	public static void main(String[] args) {
		OverridingBase obj;
		OverridingDerived d=new OverridingDerived();
		
		obj=d;
		obj.display("Override demo");
		d.display("in Derived class");
		
		d.method();
	}
}
