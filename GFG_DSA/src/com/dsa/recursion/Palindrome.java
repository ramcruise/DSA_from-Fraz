package com.dsa.recursion;

public class Palindrome {

	public static void main(String[] args) {
		String s = "GeekskeeGs";
		boolean val = isPalindrome(s,0,s.length()-1);
		System.out.println("Given str is palindrome : "+val);
	}

	private static boolean isPalindrome(String str, int start, int end) {
			if(start >= end)
				return true;
			
		return ((str.charAt(start) == str.charAt(end)) &&  isPalindrome(str, start + 1, end - 1));
	}

}
//Time complexity : O(n) and space complexity : O(n)