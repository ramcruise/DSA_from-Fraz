package com.java.Arrays;

public class Max_Consecutive_2 {

	public static void main(String[] args) {
		int[] num = {0,1,1,1,0,0,1,1,0,0,1,1,1,1};
		int val = maxConsecutive(num);
		System.out.println("max consecutive number :" +val);
	}

	private static int maxConsecutive(int[] num) {
		int count =0;
		int max = 0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==1) {
				count++;
			}else {
				count =0;
			}
			max = Math.max(max, count);
		}
		return max;
	}

}
