package com.dsa.basics.Jan9TH;

import java.util.Scanner;

//https://leetcode.com/problems/power-of-two/
public class Power_Of_Two_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which you want to know it that a power of two or not");
		/*
		 * int number = s.nextInt(); boolean flag = false; int power=0, temp = 0;
		 * 
		 * while(temp<number) { temp = (int)(Math.pow(2, power)); power++; } if(temp ==
		 * number) flag=true;
		 * 
		 * System.out.println("Given number "+number +" is power of 2 "+flag);
		 */
		int number = s.nextInt();
		boolean val = isPowerOfTwo(number);
		System.out.println("Given number is a power of 2 "+val);
	}
	
	 public static boolean isPowerOfTwo(int number) {
		 if(number == 1)
			 return true;
		 
		 if(number <=0)
			 return false;
		 
		 while(number%2 ==0) {
			 number = number/2;
		 }
		 
		 if(number == 1)
			 return true;
		 
		 return false;
	 }

}
