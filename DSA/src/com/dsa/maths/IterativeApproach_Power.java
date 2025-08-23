package com.dsa.maths;

public class IterativeApproach_Power {

	public static void main(String[] args) {
		int x = 4;
		int n = 2;

		System.out.println("Power is " + power(x, n));
	}
	static int power(int x, int n)
	{
		// Initialize result
		int res = 1;

		while (n > 0)
		{
			// If n is odd,
			// multiply
			// x with result
			if (n%2 != 0)
				res = res * x;

			// n must be even now
			n = n/2; // n = n/2
			x = x * x; // Change x to x^2
		}
		return res;
	}
}
