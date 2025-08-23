package com.dsa.maths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prime_Factors {

	public static void main(String[] args) {
		int num = 315;

		List<Integer> arrList = new ArrayList<Integer>();

		if (num % 2 == 0 || num % 3 == 0) {
			arrList.add(2);
			arrList.add(3);
		}
		for (int i = 5; i * i < num; i = i + 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				arrList.add(i);
			}
		}
		System.out.println("Prime factors of the given number are : " + arrList);
		System.out.println("===================");
		primeFactors(num);
		System.out.println("===========more efficient approach=======");
		primFactorsMoreEffient(num);
	}

	private static void primFactorsMoreEffient(int num) {
		if (num <= 1)
			return;
		while (num % 2 == 0) {
			System.out.print(2 + " ");
			num = num / 2;
		}
		while (num % 3 == 0) {
			System.out.print(3+" ");
			num = num / 3;
		}
		for (int i = 5; i * i <= num; i = i + 6) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}
			while (num % (i + 2) == 0) {
				System.out.print(i + 2 + " ");
				num = num / (i + 2);
			}
		}
		if (num > 3)
			System.out.print(num);

	}

	private static void primeFactors(int num) {
		if (num <= 1)
			return;
		for (int i = 2; i * i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num = num / i;
			}
		}
		if (num > 1)
			System.out.println(num);
	}

}
