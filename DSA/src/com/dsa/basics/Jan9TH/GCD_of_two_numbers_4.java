package com.dsa.basics.Jan9TH;

import java.util.Scanner;

public class GCD_of_two_numbers_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the num1 and num2");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int GCF = findGCF(num1,num2);
		System.out.println("GCF is : "+GCF);
	}

	private static int findGCF(int num1, int num2) {
		int result = Math.min(num1, num2);
		while(result>0) {
			if(num1%result==0 && num2%result==0) {
				break;
			}
		result--;
		}
		return result;
	}

}
