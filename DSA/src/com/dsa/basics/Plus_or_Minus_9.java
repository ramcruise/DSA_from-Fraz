//https://codeforces.com/problemset/problem/1807/A
//Plus or minus
package com.dsa.basics;

import java.util.Scanner;

public class Plus_or_Minus_9 {

	public static void main(String[] args) {
		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter ,how many rows you want"); int num = s.nextInt();
		 * 
		 * while(num-- > 0) { int a = s.nextInt(); int b = s.nextInt(); int c =
		 * s.nextInt();
		 * 
		 * if(a+b == c) { System.out.println('+'); }else { System.out.println('-'); } }
		 * s.close();
		 */
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a+b == c) {
				System.out.println('+');
			} else {
				System.out.println('-');
			}
		}
		sc.close();
    
	}
	
	

}
