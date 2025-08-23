package com.java.recursion;

public class Recursion_1 {

	public static void main(String[] args) {
		int num = 2;
		fun1(num);
	}

	private static void fun1(int num) {
		if(num==0)
			return ;
		System.out.println("GFG : "+num);
		fun1(num-1);
	}

}
