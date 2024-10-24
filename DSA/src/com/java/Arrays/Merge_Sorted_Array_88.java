package com.java.Arrays;

import java.util.Arrays;

public class Merge_Sorted_Array_88 {

	public static void main(String[] args) {
		int m = 3;
		int[] num1 = {1,2,3,0,0,0};
		int n = 3;
		int[] num2 = {2,5,6};
		
		 mergeSortedArray(num1,m,num2,n);
		//System.out.println(Arrays.toString(sortedArray));
		
	}

	private static void mergeSortedArray(int[] num1, int m, int[] num2, int n) {
		int p = m+n-1;
		int p1 = m-1;
		int p2 = n-1;
		
		while(p1 >= 0 && p2 >= 0) {
			if(num1[p1] > num2[p2]) {
				num1[p] = num1[p1];
				p1--;
				p--;
			}else {
				num1[p]= num2[p2];
				p2--;
				p--;
			}
		}
		while(p2 >= 0) {
			 num1[p]= num2[p2];
			 p2--;
			 p--;
		}
		System.out.println(Arrays.toString(num1));
		//return num1;
	}

}
