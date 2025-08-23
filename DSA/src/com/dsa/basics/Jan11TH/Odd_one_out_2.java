package com.dsa.basics.Jan11TH;

import java.util.Scanner;

//https://codeforces.com/contest/1915/problem/A
public class Odd_one_out_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of input");
		int number_of_input = s.nextInt();

		while (number_of_input-- > 0) {
			System.out.println("Please enter the value of a,b and c attributes");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if (a == b)
				System.out.println("the odd is " + c);
			else if (b == c)
				System.out.println("the odd is " + a);
			else if(a == c)
				System.out.println("the odd is " + b);
		}
	}

}
