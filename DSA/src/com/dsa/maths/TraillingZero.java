package com.dsa.maths;

public class TraillingZero {

	public static void main(String[] args) {
		int number = 20;

		System.out.println(countTrailingZeros(number));

	}

	static int countTrailingZeros(int n)
	{
		int res = 0;

		for(int i=5; i<=n; i=i*5)
		{
			res = res + (n / i);
		}

		return res;
	}

}
