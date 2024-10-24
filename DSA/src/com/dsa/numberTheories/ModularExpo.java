package com.dsa.numberTheories;

import java.util.Scanner;

//Finding power of given number
public class ModularExpo {
	public static long mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values a :");
		long a = sc.nextLong();
		System.out.println("Enter values n :");
		long n = sc.nextLong();
		System.out.println(powUnderMod(a, n));
	}

	static long powUnderMod(long a, long n) {
		if(n == 0)
			return 1;
		long partialAns = powUnderMod(a, n/2);
		
		partialAns = mul(partialAns, partialAns);
		
		if(n%2==0) 
			return partialAns;
		
		return mul(partialAns,a);
	}

	private static long mul(long a, long b) {
		return ((a%mod) * (b%mod))%mod;
	}
	
}
