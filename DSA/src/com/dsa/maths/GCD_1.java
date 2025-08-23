package com.dsa.maths;
//Euclidean approach
public class GCD_1 {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		int gcdVal = findGCD(num1,num2);
		System.out.println("GCD is bwt "+num1+" and "+num2+" is : "+gcdVal);
	}

	private static int findGCD(int a, int b) {
		if(a<1 || b<1) {
			return 0;
		}
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}else {
				b = b-a;
			}
		}
		return a;
	}

}
