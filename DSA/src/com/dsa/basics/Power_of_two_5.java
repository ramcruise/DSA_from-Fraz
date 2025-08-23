package com.dsa.basics;

import java.util.Scanner;

//Challenge: Find if a given number is a perfect power of 2 or not? E.g. 1, 2, 4, 8, 16 etc. are perfect powers of 2, whereas 3, 6, 10 are not.
public class Power_of_two_5 {

	public static void main(String[] args) {
		int number, temp = 0, power = 0;
		boolean flag = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number which need to be checked the power of 2");
		number = s.nextInt();
		while (temp < number) {
			temp = (int) Math.pow(2, power);
			power++;
		}

		if (temp == number) {
			flag = true;
			System.out.println("Given number is power of 2 : " + flag);
		} else
			System.out.println("Given number is power of 2 : " + flag);

		s.close();
	}

}
