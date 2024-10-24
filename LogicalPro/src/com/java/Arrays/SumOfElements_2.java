package com.java.Arrays;
//how to find pairs in array with given sum. 
//Write a Java Program to find pairs with given sum in a sorted array.

public class SumOfElements_2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int sum = 8;
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			if(arr[low]+arr[high] > sum) {
				high--;
			}else if(arr[low]+arr[high] < sum) {
				low++;
			}else if(arr[low]+arr[high] == sum) {
				System.out.println("pair of ("+arr[low]+" "+arr[high]+")");
				low++;
				high--;
			}
		}
		
	}

}
