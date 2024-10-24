//Find sum of all odd numbers from 1 to N
package com.dsa.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_Odd_Nums_4 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range till you want to check even_odd value");
		int num = s.nextInt();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		/*
		 * for (int i = 1; i <= num; i++) { if (i % 2 != 0) arraylist.add(i); } for(int
		 * j: arraylist) sum = j+sum;
		 */
		for (int count = 1; count <= num; count++) {
			if (count % 2 != 0) {
				arraylist.add(count);
				sum = sum + count;
			}
		}

		System.out.println("List of odd numbers from the given Number: " + arraylist);
		System.out.println("Sum : " + sum);
	}

}
