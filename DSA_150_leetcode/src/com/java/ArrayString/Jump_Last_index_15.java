package com.java.ArrayString;

public class Jump_Last_index_15 {

	public static void main(String[] args) {
		int[] jump= {2,3,1,1,4};
		boolean val = canJump(jump);
		System.out.println("can it jump to last index : "+val);
	}

	public static boolean canJump(int[] nums) {
		int lastGoodIndexPosition = nums.length-1;
		for(int i=lastGoodIndexPosition;i>=0;i--) {
			if(i+nums[i]>=lastGoodIndexPosition) {
				lastGoodIndexPosition = i;
			}
		}
		
		return lastGoodIndexPosition ==0;
		
	}

}
