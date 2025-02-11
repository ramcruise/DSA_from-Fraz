package com.dsa.numberTheories;

public class PrimeNumber_1 {

	public static void main(String[] args) {
		int n = 25;
		//boolean val = primeNumber(n);
		boolean val2 = primeNumber2(n);
		System.out.println("the given number is Prime_number :"+val2);
	}

	

	//Time complexity is : O(n);
	private static boolean primeNumber(int n) {
		if(n==1)
			return false;
		for(int i = 2; i<n ; i++) {
			if(n%i == 0) 
				return false;
		}
		return true;
	}
	
	//Time complexity is : O(square root of n);  its lees than above one
	private static boolean primeNumber2(int n) {
		if(n==1)
			return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}

}
