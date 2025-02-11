package com.dsa.seraching;
//33.) Search in Rotated Sorted Array
public class BinarySearch_33 {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		int index = findElement(nums,target);
		System.out.println("index val is : "+index);
	}

	private static int findElement(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		
		int lastElement = nums[high];
		while(low <= high) {
			int mid = (low+high)/2;
			if(target > lastElement && nums[mid] <= lastElement  ) {
				high = mid-1;
			}
			else if(target <= lastElement && nums[mid] > lastElement  ) {
				low = mid+1;
			}
			else {
				if(nums[mid]==target) {
					return mid;
				}
				else if(nums[mid] < target) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
		}
		
		return -1;
	}

}
