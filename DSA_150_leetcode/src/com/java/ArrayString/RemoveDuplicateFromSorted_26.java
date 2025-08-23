package com.java.ArrayString;

public class RemoveDuplicateFromSorted_26 {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int ans = removeDuplicates(nums);
		System.out.println(ans);
	}

	public static int removeDuplicates(int[] nums) {
        int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(i<nums.length-1 && nums[i]==nums[i+1]) {
				continue;
			}else {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
    }
	
}
