//Given a number, N. Find the sum of all the digits of N
//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
package com.dsa.basics;

import java.util.Scanner;

public class Sum_of_All_digits_6 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = s.nextInt();
		while(num>0) {
			sum = sum + (num%10);
			num = num/10;
		}
		System.out.println(sum);
	}

}
