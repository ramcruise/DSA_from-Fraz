package com.java.two_pointer;

import java.util.Arrays;

//167. Two Sum II - Input Array Is Sorted
public class Two_sum {

	public static void main(String[] args) {
		int numbers[] = {2,7,11,18,28,39,48,59,68,78,89,90,100}; 
		int target = 41;
		int[] index = twoSum(numbers,target);
		System.out.println(Arrays.toString(index));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int s_pointer = 0;
		int e_pointer = numbers.length-1;
		
		while(s_pointer <= e_pointer) {
			int sum = numbers[s_pointer]+numbers[e_pointer];
			if(sum<target) {
				s_pointer +=1;
			}else if(sum>target) {
				e_pointer -=1;
			}else {
				return new int[] {s_pointer+1,e_pointer+1};
			}
			
		}
		
		return new int[] {s_pointer+1,e_pointer+1};
	}
}
