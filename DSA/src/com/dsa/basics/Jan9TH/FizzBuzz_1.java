package com.dsa.basics.Jan9TH;
//https://www.hackerrank.com/challenges/fizzbuzz/problem
public class FizzBuzz_1 {
	public static void main(String[] args) {
		int n = 100;
		for(int i=1;i<=n;i++) {
			  if(i%3 == 0 && i%5 == 0) {
				System.out.println("Fizzbuzz");
			}else if(i%3 == 0) {
				System.out.println("Fizz");
			}else if(i%5 == 0) {
				System.out.println("Buzz");
			}else
				System.out.println(i);
		}
	}
}
