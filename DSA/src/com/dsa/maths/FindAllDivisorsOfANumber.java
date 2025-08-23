package com.dsa.maths;

import java.util.ArrayList;
import java.util.List;

public class FindAllDivisorsOfANumber {

	static List<Integer> listOfDiv;

	public static void main(String[] args) {
		listOfDiv = new ArrayList<Integer>();
		int num = 25;
		List<Integer> allDivisors = effectiveSolution(num);
		System.out.println("all divisors of given number : "+allDivisors);
	}

	private static List<Integer> effectiveSolution(int num) {
		for(int i=1;i*i<num;i++) {
			if(num%i==0) {
				listOfDiv.add(i);
				if(i!=num/i) {
					listOfDiv.add(num/i);
				}
			}
		}
		return listOfDiv;
	}

	private static List<Integer> naiveSolution(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				listOfDiv.add(i);
			}
		}
		return listOfDiv;

	}
}
