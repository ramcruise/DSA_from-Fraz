//https://leetcode.com/problems/ugly-number/
//Ugly number
package com.dsa.basics;

import java.util.Scanner;

public class Ugly_number_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = s.nextInt();
		System.out.println(isUglyNum(num));
		
	}
	
	public static boolean isUglyNum(int num) {
		while(num>1) {
			if(num%2 == 0) {
				num = num/2;
			}else if(num%3 == 0) {
				num = num/3;
			}else if(num%5 == 0) {
				num = num/5;
			}else {
				return false;
			}
		}
		
		if(num == 1) {
			return true;
		}else 
			return false;
		
	}

}
