package com.dsa.maths;

import java.util.Scanner;

public class AdditionalModulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the values");
		long a = sc.nextLong();
		long b = sc.nextLong();
		long m = sc.nextLong();
		long val = underAdditionalModulo(a,b,m);
		System.out.println("val is : " +val);
	}
	//Time complexity : O(logB)
	private static long underAdditionalModulo(long a, long b, long m) {
		if(b==0)
			return 0;
		long halfAns = underAdditionalModulo(a, b/2, m);
		if(b%2 == 0)
			return (halfAns + halfAns)%m;
		
		return (halfAns + halfAns +a)%m;
	}

}
