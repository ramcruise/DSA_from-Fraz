package com.dsa.string;

import java.util.Scanner;

//add first and last num
public class Logical_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the number");
		int num = s.nextInt();
		 String str =Integer.toString(num);
		 
		 int firtDigit = str.charAt(0)-'0';
		 int lastDigit = str.charAt(str.length()-1) - '0';
		 System.out.println(firtDigit+lastDigit);
	}

}
