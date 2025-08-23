package com.java.recursion;

import java.util.ArrayList;
import java.util.List;

public class Paranthesis_22 {

	public static void main(String[] args) {
		int n = 3;
		 List<String> ans= generateParathensis(n);
		 System.out.println(ans);
	}
	
	public static List<String> generateParathensis(int n){
		List<String> ans = new ArrayList<String>();
		solve("",0,0,n,ans);
		return ans;
		
	}

	private static void solve(String curr, int open, int closed, int total, List<String> ans) {
		if(curr.length()==2*total) {
			ans.add(curr);
			return;
		}
		
		if(open<total) {
			solve(curr+"(",open+1,closed,total,ans);
		}
		
		if(closed<open) {
			solve(curr+")",open,closed+1,total,ans);
		}
		
	}
}
