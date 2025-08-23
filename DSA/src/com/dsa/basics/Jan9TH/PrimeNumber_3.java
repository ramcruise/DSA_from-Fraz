package com.dsa.basics.Jan9TH;

import java.util.Scanner;

//https://www.geeksforgeeks.org/problems/prime-number2314/1
public class PrimeNumber_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number to be chekced prime or not");
		int n= s.nextInt();
		int val = isPrime(n);		
		System.out.println("Given numbe is prime : "+val);
	}

	private static int isPrime(int n) {
		if(n<=1)
			return 0;
		
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

}
