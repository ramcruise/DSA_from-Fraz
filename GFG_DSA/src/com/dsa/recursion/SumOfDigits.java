package com.dsa.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 253;
		int val = sumOfDigits(num);
		System.out.println(val);
	}

	private static int sumOfDigits(int num) {
		if(num == 0)
			return 0;
		return sumOfDigits(num/10) + num%10;
	}

}
