package com.java.recursion;

public class Recursion_2 {

	public static void main(String[] args) {
		fun(3);
	}

	private static void fun(int num) {
		if(num==0)
			return;
		
		System.out.println(num);
		fun(num-1);
		System.out.println(num);
			
	}

}
