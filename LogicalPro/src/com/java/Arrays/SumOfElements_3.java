package com.java.Arrays;
//Find the pairs in given array sum
public class SumOfElements_3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int sum = 10;
		
		int low = 0;
		int high = arr.length-1;
		for(int i =0; i<=high;i++) {
			if(arr[low]+arr[high]<sum) {
				low++;
			}else if(arr[low]+arr[high]>sum) {
				high--;
			}else if(arr[low]+arr[high]==sum) {
				System.out.println(arr[low]+" ,"+arr[high]);
				low++;
				high--;
			}
		}
		
	}

}
