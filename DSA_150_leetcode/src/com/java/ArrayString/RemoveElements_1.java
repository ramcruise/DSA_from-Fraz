package com.java.ArrayString;

public class RemoveElements_1 {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		int ans = removeElement(nums, val);
		System.out.println(ans);
	}
	
	public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        while(i < len){
            if(nums[i] == val){
                nums[i] = nums[len-1];
                len--;
            }else{
                i++;
            }
        }
        return i;
    }

}
