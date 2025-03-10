package com.dsa.maths;

import java.util.Scanner;
//Link : https://www.codechef.com/problems/STRNO
public class StrangeNumber {

	//Time complexity : O(sqrt(X)) per test case
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number : ");
		int t = sc.nextInt();
		while(t-- > 0) {
			int X = sc.nextInt();
			int K = sc.nextInt();
			
			// Lets find sum powers of prime factors of X
			int sumPrimePowers = 0;
			for(int i =2; i*i <= X; i++) {
				while(X%i == 0) {
					sumPrimePowers +=1;
					X /= i;
				}
			}
			
			if(X > 1) 
				sumPrimePowers +=1; 
			if(sumPrimePowers >= K)
				System.out.println("output : "+1);
			else
				System.out.println("output : "+0);
		}
	}

}
