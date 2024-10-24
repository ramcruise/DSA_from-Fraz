package com.java.Arrays;

import java.util.HashSet;
import java.util.Set;

/*Write a java code to find duplicate elements in array.  
Print Duplicate in Array InterviewBit solution.*/

public class Duplicate_elements_1 {
	
	public static void main(String[] args) {
		int[] arr = {1,3,6,3,1,7,9,7};
		Set<Integer> uniqueNumber = new HashSet<Integer>();
		boolean isDuplicateExist = false;
		for(int i=0; i<arr.length;i++) {
			if(uniqueNumber.contains(arr[i])) {
				isDuplicateExist = true;
				System.out.println("Duplicate value: "+arr[i]);
			}else {
				uniqueNumber.add(arr[i]);
			}
		}
		if(!isDuplicateExist) {
			System.out.println(-1);
		}
	}
	

}
