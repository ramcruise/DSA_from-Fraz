package com.dsa.basics.Jan9TH;
//https://codeforwin.org/c-programming/c-program-to-print-number-pattern-with-0-1-at-alternate-rows
public class Pattern_programs_7 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i%2 !=0)
				System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
