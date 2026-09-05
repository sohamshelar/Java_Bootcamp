package com.Date4_Sept;

public class TreadDemoMain {
	public static void main(String[] args) {
		Threaddemo d1=new Threaddemo();
		Threaddemo d2=new Threaddemo();
		d1.setName("One");
		d2.setName("Two");
		
		d1.start();
		d2.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("in main -> " + i);
		}
	}
	
}
