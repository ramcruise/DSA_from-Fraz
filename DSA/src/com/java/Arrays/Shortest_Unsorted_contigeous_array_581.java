package com.java.Arrays;

import java.util.Arrays;

public class Shortest_Unsorted_contigeous_array_581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,4,8,10,9,15};
		int val = findUnsortedSubarray(arr);
		System.out.println(val);

	}

	private static int findUnsortedSubarray(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int n = nums.length;
		
		for(int i=1;i<n;i++) {
			if(nums[i]<nums[i-1])
				min = Math.min(min, nums[i]);
		}
		
		for(int i=n-2;i>=0;i--) {
			if(nums[i]>nums[i+1])
				max = Math.max(max, nums[i]);
		}

		if(min == Integer.MAX_VALUE && max == Integer.MIN_VALUE)
			return 0;
		
		int start = 0, end = n-1;
		for( ; start < n ; start++) {
			if(nums[start]>min)
				break;
		}
		
		for( ; end >=0 ; end--) {
			if(nums[end] < max)
				break;
		}
		System.out.println(Arrays.toString(nums));
		return end-start +1;
	}

}
