package com.java.Arrays;

import java.util.Scanner;

public class LargestNumber_1 {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter the number a");
		int a = s.nextInt();
		
		System.out.println("Enter number b");
		int b = s.nextInt();
		
		System.out.println("Enter number c");
		int c = s.nextInt();
		
		/*
		 * if(a>b && a>c) { System.out.println("lasrgest num is : "+a); }else if(b>a &&
		 * b>c) { System.out.println("lasrgest num is : "+b); }else {
		 * System.out.println("largest num is : "+c); }
		 */

		int largest = a>b?a:b;
		 largest = c>largest?c:largest;
		System.out.println("largest number amoung all : "+largest);
	}

}
