package com.dsa.basics.Jan11TH;

import java.util.Scanner;

//https://leetcode.com/problems/sum-multiples/description/
public class Sum_Multiplies_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num please");
		int num = s.nextInt();
		int sum = 0;
		while(num >=1) {
			if(num%3==0 || num%5==0 || num%7==0) {
				sum = sum+num;
			}
			num--;
		}
		System.out.println("sum of multiples is : "+sum);
	}

}
