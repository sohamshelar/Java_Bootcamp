package com.demo;
import java.util.Scanner;
public class CubeOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find a cube of number");
		int i=sc.nextInt();
		int cube=i*i*i;
		System.out.println("Cube of the num is "+ cube);
		
	}
}
