package com.java.Arrays;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 7, 4, 8, 9 ,3};
		int[] sortAr = sortArr(arr);
		Arrays.stream(sortAr).distinct();
		System.out.println(Arrays.toString(sortAr));
	}

	private static int[] sortArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}
		return arr;
	}

}
