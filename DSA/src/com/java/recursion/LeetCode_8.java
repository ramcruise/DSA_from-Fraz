package com.java.recursion;

import java.util.Scanner;

//https://leetcode.com/problems/string-to-integer-atoi/description/
public class LeetCode_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num"); 
		double num = s.nextDouble();
		System.out.println("Enter pow");
		 int pow = s.nextInt();
		 double val = myPow(num, pow);
		 System.out.println("power is :"+val);
	}
	
	public static double  myPow(double x, int n) {
		double ans = 1.0;
		long pow = n;
		
		if( pow < 0 )
			pow = -1*pow;
		
		while( pow > 0 ) {
			if(pow %2 == 1) {
				ans = ans*x;
				pow = pow - 1;
				
			}else {
				x = x*x;
				pow = pow/2;
			}
		}
		
		if( n < 0 )
			ans = (double)(1.0)/(double)(ans);
		return ans;
	}

}
