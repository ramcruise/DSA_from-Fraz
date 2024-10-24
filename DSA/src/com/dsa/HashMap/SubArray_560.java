package com.dsa.HashMap;

import java.util.HashMap;

public class SubArray_560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		int k = 3;
			int val = subarraySum(nums,k);
		System.out.println(val);  
	}
	public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> preSumCnt = new HashMap<>();
        preSumCnt.put(0,1); //pre[-1]


        int preSum = 0, ans = 0;
        for(int en = 0; en < nums.length; en++){
          preSum +=nums[en];

          ans += preSumCnt.getOrDefault(preSum-k, 0);

          int curFreq = preSumCnt.getOrDefault(preSum,0);
          preSumCnt.put(preSum,curFreq + 1);
        }
        return ans;
  }
}
