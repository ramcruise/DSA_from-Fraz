package com.dsa.recursion;

public class Test_2 {

	public static void main(String[] args) {
		fun(3);
	}

	private static void fun(int n) { //3
		if(n==0)
			return;
		fun(n-1); //2,1
		System.out.println(n);//1
		fun(n-1);
	}

}
