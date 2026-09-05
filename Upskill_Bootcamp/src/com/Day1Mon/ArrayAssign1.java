package com.Day1Mon;

import java.util.Scanner;

public class ArrayAssign1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements to store in first array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter numbers for first array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter number of elements to store in Second array");
        int se = sc.nextInt();

        int b[] = new int[se];

        System.out.println("Enter numbers for second array");
        for (int i = 0; i < se; i++) {
            b[i] = sc.nextInt();
        }

        int ss = n + se;

        int c[] = new int[ss];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        System.out.println("Merged array:");

        for (int i = 0; i < c.length; i++) {
            System.out.println("c array = " + c[i]);
        }
    }
}