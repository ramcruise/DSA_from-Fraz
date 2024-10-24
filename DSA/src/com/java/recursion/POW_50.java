package com.java.recursion;

public class POW_50 {

	public static void main(String[] args) {
		int digit = 2;
		int pow = 4;
		int power = findPOW(digit,pow);
		System.out.println(power);
	}

	private static int findPOW(int digit, int pow) {
		if(pow == 0)
			return 1;
		if(pow < 0)
			findPOW(1/digit,-pow);	
		
		return 0;
	}
}


