package com.java.frequentlyAskedLogical;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter String val");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("rev of given String val : "+rev);
	}

}
