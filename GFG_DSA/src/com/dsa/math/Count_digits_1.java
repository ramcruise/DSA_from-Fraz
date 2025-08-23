package com.dsa.math;

import java.util.Scanner;

//Given a number N, the task is to return the count of digits in this number.
public class Count_digits_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int count = 0;
		int reverse = 0;
		int number = sc.nextInt();
		while(number > 0) {
			reverse = reverse*10 + number%10;
			number = number/10;
			count++;
		}
		System.out.println("count of digits :"+count);
		System.out.println("reverse of number :"+reverse);
	}

}

//time complexity O(log(n))
//space complexity O(1)