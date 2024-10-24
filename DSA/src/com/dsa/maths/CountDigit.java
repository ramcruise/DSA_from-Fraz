package com.dsa.maths;

public class CountDigit {

	public static void main(String[] args) {
		int val = 1478;
		int count = countDigit(val);
		System.out.println("The count of digit for "+val+" is : "+count);
	}
	
	public static int countDigit(int val) {
		int count = 0;
		while(val!=0) {
			count++;
			val = val/10;
		}
		return count;
	}
}
