package com.java.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

	public static void main(String[] args) {
		int[] arr = {3,2,4};
		int target = 6;
		int[] val = twoSum(arr, target);
		System.out.println(Arrays.toString(val));
	}
	
	public static int[] twoSum(int[] arr, int target) {
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					return new int[] {i,j};
//				}
//			}
//		}
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int val = arr[i];
			int find = target-val;
			
			if(map.containsKey(find)) {
				return new int[] {i,map.get(find)};
			}
			
			map.put(val, i);
		}
		
		
		return new int[] {-1,-1};
	}

}
