package com.dsa.maths;

public class LCM {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 6;
		int lcdVal = findLCd(num1, num2);
		int lcdVal2 = findLCd2(num1, num2);
		System.out.println("LCM of given number " + num1 + " and " + num2 + " is : " + lcdVal);
		System.out.println("optimised approach LCM of given number " + num1 + " and " + num2 + " is : " + lcdVal2);
	}

//naive approach
	private static int findLCd(int num1, int num2) {
		int res = Math.max(num1, num2);
		while (true) {
			if (res % num1 == 0 && res % num2 == 0)
				return res;
			res++;
		}
		// return res;
	}

	// optimised approach
	private static int findLCd2(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
