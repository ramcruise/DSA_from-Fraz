package com.dsa.basics;

import java.util.Scanner;

public class Find_Max_of_3_Integers_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the num a");
		int a = s.nextInt();
		
		System.out.println("please enter the num b");
		int b = s.nextInt();
		
		System.out.println("please enter the num c");
		int c = s.nextInt();
		
		//first approach
		/*
		 * if(a>b && a>c) { System.out.println(a+" is greater num"); }else if(b>a &&
		 * b>c) { System.out.println(b+" is greater num"); }else {
		 * System.out.println(c+" is greater num"); }
		 */		
		
		//Second approach
		/*
		 * int largest = a>b ? a:b; int more_larg = c>largest ? c:largest;
		 * System.out.println(more_larg);
		 */
		
		//Third approach
		int largest_num = c>(a>b ? a:b)? c:(a>b ? a:b);
		System.out.println(largest_num);
	}

}
