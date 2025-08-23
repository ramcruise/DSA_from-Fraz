package com.dsa.maths;
//Optimised Euclidean approach 
public class GCD_2 {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 15;
		int gcdVal = findGCD(num1,num2);
		System.out.println("GCD is bwt "+num1+" and "+num2+" is : "+gcdVal);
	}

	private static int findGCD(int a, int b) {
		if(b==0) 
			return a;
		else
			return findGCD(b, a%b);
		
	}

}
