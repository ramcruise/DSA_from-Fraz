package com.dsa.stack;

import java.util.Stack;

public class Paranthesis_20 {

	public static void main(String[] args) {
		String s = "(())";
		  boolean ans = isValid(s);
		  System.out.println("is given Paranthesis valid : "+ans);
	}

	private static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<s.length(); i++) {
			if( s.charAt(i) == '{' && s.charAt(i) == '[' && s.charAt(i) == '(') {
				st.push(s.charAt(i));
			}else {
				if(st.isEmpty())
					return false;
				else if(s.charAt(i) == '}' && st.peek() == '}' ||
						s.charAt(i) == ']' && st.peek() == ']' || 
						s.charAt(i) == ')' && st.peek() == ')' ) {
					st.pop();
				}else {
					return false;
				}
			}
		}
		return st.empty();
	}

}
