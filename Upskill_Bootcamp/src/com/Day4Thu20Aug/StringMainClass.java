package com.Day4Thu20Aug;

public class StringMainClass {
	public static void main(String[] args) {
		String str="This is string";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf("is"));
		System.out.println(str.lastIndexOf("is"));
		str= str.concat(" Function");
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str);
		System.out.println(str.toLowerCase());
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println(str.substring(20, 23));
		char ch[]=str.toCharArray();//it returns the char array
		String s1=ch.toString();
		
		
	}
}
