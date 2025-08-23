package com.java.ArrayString;

public class RemoveDuplicates_80 {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,1,2,2,2,3};
		int ans = removeDuplicates(nums);
		System.out.println(ans);
	}
	
	public static int removeDuplicates(int[] nums) {
		int in=2;
		for(int i=2; i<nums.length;i++) {
			if( nums[i]!=nums[in-2]) {
				nums[in] = nums[i];
				in++;
			}
		}
		return in;
	}

}
