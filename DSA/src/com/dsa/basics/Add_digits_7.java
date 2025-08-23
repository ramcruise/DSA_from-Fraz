//https://leetcode.com/problems/add-digits/
package com.dsa.basics;

import java.util.Scanner;

public class Add_digits_7 {

	public static void main(String[] args) {
		System.out.println("starting program");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int singleDigit = 0;
		singleDigit = addDigits(num);
		System.out.println(singleDigit);

		/*
		 * while(singleDigit>9) { singleDigit = addDigits(singleDigit); }
		 */
		// System.out.println(singleDigit);
	}

	public static int addDigits(int num) {
		
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum = sum + (num % 10);
				num = num / 10;
			}
			num = sum;
		}
		return num;
	}

}
