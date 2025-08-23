package com.java.ArrayString;

//169. Majority Element
public class Majority_element_169 {

	public static void main(String[] args) {
		int[] nums = {3,2,3,5,5,5,5,5,6,7,8,4,4,4,4};
		int max_occurence= majorityElement(nums);
		System.out.println(max_occurence);
	}

	public static int majorityElement(int[] nums) {
		int max_occ_num = 0;
		int max_count=1;
		int count = 1;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
				
			}
			
			if(count>max_count) {
				max_count = count;
			  max_occ_num=nums[i];
			}else {
				max_occ_num=nums[i];
			}
		}
		
		return max_occ_num;
	}
	
	public static int majorityElement2(int[] nums) {
		int count =0;
		int cand = 0;
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				cand = nums[i];
			}
			if(cand==nums[i]) {
				count++;
			}else {
				count--;
			}
		}
		return cand;
	}
}
