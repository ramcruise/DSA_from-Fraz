package com.dsa.maths;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 6;
		int val = factorialNum(6);
		System.out.println("factorial of "+num+" is: "+val);
	}

	//Time Complexity: O(n), Auxiliary Space: O(1)	
	private static int factorialNum(int num) {
		int factorial = 1;
		for(int i = num; i>0; i--) {
			factorial *= i;
		}
		return factorial;
	}

}
