package com.dsa.basics;

import java.util.Scanner;

public class Leap_Year_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the year to be checked foe leap year");
		int year = s.nextInt();
		boolean flag = false;

		if (year % 4 == 0) {
			flag = true;
			if (year % 100 == 0) {
				if (year % 400 == 0)
					flag = true;
				else
					flag = false;
			}			
		} 

		System.out.println(year + " is a leap year ? " + flag);
	}

}
