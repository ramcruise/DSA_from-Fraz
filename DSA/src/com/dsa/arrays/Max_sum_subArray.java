package com.dsa.arrays;
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class Max_sum_subArray {

	public static void main(String[] args) {
		int arr[] = {100,200,300,400};
		int size= 2;
		
		int max = maximumSumSubarray(arr,size);
		System.out.println("max value : "+max);
	}

	private static int maximumSumSubarray(int[] arr, int k) {
		 int curr_sum = 0;
	        int final_sum = 0;
	        for(int i = 0; i < k ; i++)
	            curr_sum += arr[i];
	        
	        final_sum = curr_sum;
	        
	        for(int st=1,en=k; en<arr.length; st++,en++){
	            curr_sum -= arr[st-1];
	            curr_sum += arr[en];
	            
	            final_sum = Math.max(final_sum,curr_sum);
	        }
	        return final_sum;
	}

}
