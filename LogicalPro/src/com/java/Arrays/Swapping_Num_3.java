package com.java.Arrays;

public class Swapping_Num_3 {

	public static void main(String[] args) {
		int a =10, b=20;
		System.out.println("before swapping a : "+a +" and b :"+b);
		/*
		 * int t =a; a=b; b=t;
		 */
		a=a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping a : "+a +" and b :"+b);
	}

}
