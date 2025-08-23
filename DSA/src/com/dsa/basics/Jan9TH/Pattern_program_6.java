package com.dsa.basics.Jan9TH;
//https://codeforwin.org/c-programming/right-triangle-star-pattern-program-in-c
public class Pattern_program_6 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
