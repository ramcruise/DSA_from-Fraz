package com.java.Arrays;

import java.util.Arrays;

public class Running_Sum_of_1d_Array_1480 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] sum = new int[arr.length];
		//first approach , time complexity : O(n^2) and space complexity : O(n)
//		for(int i=0;i<arr.length;i++) {
//			for(int j = i; j>=0;j--) {
//				sum[i]=arr[j]+sum[i];
//			}
//		}
		
		//second approach time complexity: O(n) and space complexity: O(1)
		for(int i=1;i<arr.length;i++) {
			arr[i] = arr[i]+arr[i-1];
		}
		System.out.println(Arrays.toString(arr));
	}

}
