package com.java.Arrays;

import java.util.Arrays;

public class Prefix_Max_Array_ {

	public static void main(String[] args) {
		int[] arr = {2,1,3,5,4,5,7,6};
		int[] val = new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]>arr[i-1]?arr[i]:arr[i-1];
//			if(arr[i]<arr[i-1]) {
//				arr[i] =arr[i-1];
//			}
			//arr[i] = Math.max(arr[i-1], arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
