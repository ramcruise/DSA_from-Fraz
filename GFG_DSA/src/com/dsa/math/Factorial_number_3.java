package com.dsa.math;

import java.util.Scanner;

//Factorial num
public class Factorial_number_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		 int factorialNum = fact(num);
		 System.out.println("factorial of given num is : "+factorialNum);
	}

	private static int fact(int num) {
		if(num == 0) {
			return 1;
			
		}
		return num*fact(num-1);
	}

}

//Time Complexity: O(n)
//Auxiliary Space: O(n)
