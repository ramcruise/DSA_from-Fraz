package com.java.Collection.Array.CodingInterview;

import java.util.Scanner;

public class ArraysFromConsole_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrays");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter arrays");
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
