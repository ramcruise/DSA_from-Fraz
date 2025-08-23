package com.dsa.basics.Jan11TH;

import java.util.Scanner;

public class FavouritNum_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter total numbers");
		int t = s.nextInt();
		while (t-- > 0) {
			System.out.println("Please enter the num");
			int num = s.nextInt();
			if (num % 2 == 0 && num % 7 == 0) {
				System.out.println("Alice");
			} else if (num % 2 != 0 && num % 9 == 0) {
				System.out.println("Bob");
			} else {
				System.out.println("Charlie");
			}
		}
	}

}
