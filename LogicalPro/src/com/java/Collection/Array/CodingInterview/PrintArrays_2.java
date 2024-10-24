package com.java.Collection.Array.CodingInterview;

import java.util.Arrays;

public class PrintArrays_2 {

	public static void main(String[] args) {
		String[] arr = {"Ram","Vijay","Kumar","Mohan"};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("=====================");
		//second way
		for(String str: arr)
			System.out.println(str);
		
		System.out.println("=====================");
		//Third way
		System.out.println(Arrays.asList(arr));
		
		System.out.println("=====================");
		//Fourth way
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=====================");
		//To print two dimentional array
		int[][] num = new int[][] {{2,4,6,},{56,78,90}};
		System.out.println(Arrays.deepToString(num));
		
		System.out.println("=====================");
		//using stream()
		Arrays.asList(arr).stream().forEach(s->System.out.println(s));
		
		System.out.println("=====================");
		Arrays.stream(arr).forEach(s->System.out.println(s));
	}

}
