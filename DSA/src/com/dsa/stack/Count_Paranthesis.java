package com.dsa.stack;

import java.util.Stack;

//20. Valid Parentheses
public class Count_Paranthesis {

	public static void main(String[] args) {
		String s = "()[]{}";
		boolean valid = isValid(s);
		System.out.println("Given paranthesis are valid : "+valid);
	}

		public static boolean isValid(String s) {
			if(s.length() %2 !=0)
				return false;
			
			Stack<Character> stack = new Stack<Character>();
			for(char c : s.toCharArray()) {
				if(c=='(' || c=='{' || c=='[') {
					stack.push(c);
				}else if(c==')' && !stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
				}else if(c=='}'&& !stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
				}else if(c==']'&& !stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
				}
			}
			
			return stack.isEmpty();
		}
}
