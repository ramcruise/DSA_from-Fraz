package com.dsa.recursion;
//print 1 to n
public class Recursion_fun_2 {

	public static void main(String[] args) {
		int n = 5;
		fun(n);
	}

	private static void fun(int n) {
		if(n==0)
			return;
		fun(n-1);
		System.out.println(n);
		
	}

}
