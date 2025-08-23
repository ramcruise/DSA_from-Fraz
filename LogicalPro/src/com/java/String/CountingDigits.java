package com.java.String;

import java.util.Scanner;

public class CountingDigits {

	public static void main(String[] args) {
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		for(int i =0; i<str.length();i++) {
			char c = str.charAt(i);
			c = Character.toUpperCase(c);			
			//counting number of WhiteSpace and DIgits
			if(Character.isWhitespace(c)|| Character.isDigit(c)) {
				count++;
			}
		}
		
		System.out.println("Num of digits : "+count);
	}

}
