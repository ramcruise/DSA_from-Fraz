package com.dsa.seraching;

public class BinarySearch_704 {

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 8;
		int val = binarySearchVal(nums,target);
		System.out.println("index val is : "+val);
	}

	private static int binarySearchVal(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]>target)
				high = mid-1;
			else
				low = mid+1;
		}
		
		return -1;
	}
	
	

}
