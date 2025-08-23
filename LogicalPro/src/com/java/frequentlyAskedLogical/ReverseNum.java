package com.java.frequentlyAskedLogical;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("rev of num "+rev);
	}

}
