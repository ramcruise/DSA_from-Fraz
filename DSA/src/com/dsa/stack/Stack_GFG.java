package com.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

//https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
public class Stack_GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price = {100, 80 ,60 ,70, 60, 75, 85};
		int[] val = calculateSpan(price, price.length);
		System.out.println(Arrays.toString(val));
	}
	 public static int[] calculateSpan(int price[], int n)
	    {
	        Stack<Integer> s = new Stack<>();
	        int[] ans = new int[n];
	        for(int i = 0 ; i < n  ; ++i ){
	            while(s.empty() == false && price[s.peek()] <= price[i])
	            s.pop();
	            
	            ans[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek());
	            s.push(i);
	        }
	        return ans;
	    }

}
