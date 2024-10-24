package com.dsa.recursion;

public class Recursive_Function {

	public static void main(String[] args) {
		fun(5);
	}

	private static void fun(int n) {
		if(n==0)
			return;
		System.out.print(n);
		fun(n-1);
	}

}
