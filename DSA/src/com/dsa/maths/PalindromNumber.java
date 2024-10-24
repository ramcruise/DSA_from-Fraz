package com.dsa.maths;

public class PalindromNumber {

	public static void main(String[] args) {
		int val = 2002;
		int revers = palindromNumber(val);
		if(val == revers)
			System.out.println("given number: " +val+" is Palindrom number");
		else
			System.out.println("given number: " +val+" is not a Palindrom number");
	}

	//time_complecity O(Number of digits in a given number) , Auxiliary space : O(1) or constant
	private static int palindromNumber(int val) {
		int revers_num = 0;
		while(val!= 0) {
			revers_num = revers_num*10 + val%10;
			val = val/10;
		}
		return revers_num;
	}
	
	

}
