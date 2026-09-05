package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign5_2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Reversed array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

	
}
