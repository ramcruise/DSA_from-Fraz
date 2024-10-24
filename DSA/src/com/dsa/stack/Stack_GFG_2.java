package com.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack_GFG_2 {

	public static void main(String[] args) {
		long[] arr = {1, 3, 2, 4};
		long[] val = nextLargerElement(arr, arr.length);
		System.out.println(Arrays.toString(val));
	}
	 public static long[] nextLargerElement(long[] arr, int n)
	    { 
	        Stack<Long> s = new Stack<>();
	        long ans[] = new long[n];
	        for(int i = n - 1 ; i >= 0 ; --i){
	            while(s.empty() == false && s.peek() <= arr[i])
	                s.pop();
	            ans[i] = s.empty()? -1 : s.peek();
	            s.push(arr[i]);
	        }
	        return ans;
	    } 

}
