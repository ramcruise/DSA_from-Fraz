package com.dsa.math;

import java.util.Scanner;

// 12321 is palindrome, but 1451 is not palindrome.
public class Palindrom_Number_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int reverse = 0;
		int num = sc.nextInt();
		int temp = num;
		while(num > 0) {
			reverse = reverse*10 + num%10;
			num = num/10;
		}
		if(reverse == temp) {
			System.out.println("given num is Palindrom");
		}else {
			System.out.println("given num is not Palindrom");
		}
	}

}

//Time Complexity : O(log(n)) or O(Number of digits in a given number)
//Auxiliary space : O(1) or constant