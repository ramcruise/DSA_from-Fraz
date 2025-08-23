package com.dsa.basics;

import java.util.Scanner;

public class Number_of_common_factors_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of a ");
		int a = s.nextInt();
		System.out.println("enter value of b ");
		int b = s.nextInt();
		int commonFactor = commonFactors(a, b);
		System.out.println("Common factors of given number : "+commonFactor);
	}

	public static int commonFactors(int a, int b) {
		int ans = 0;
		for(int i = 1; i<=Math.min(a, b); i++) {			
			if(a%i == 0 && b%i == 0) 
				ans++;			
		}
		
		return ans;
	}

}
