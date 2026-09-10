package com.Date10_Sept;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
	 public static void main(String[] args) {

		 	Scanner sc =new Scanner(System.in);
		 	
		 	System.out.println("Enter String to cound frequency");
		 	
	        String str =sc.nextLine();

	        HashMap<Character, Integer> hm = new HashMap<>();

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            if (hm.containsKey(ch)) {
	                hm.put(ch, hm.get(ch) + 1);
	            } else {
	                hm.put(ch, 1);
	            }
	        }

	        System.out.println(hm);
	    }
}
