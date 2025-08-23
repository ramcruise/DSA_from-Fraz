package com.java.String;

import java.util.Stack;

//Given String is well formed or not
public class WellFormedOrNot_2 {

	public static void main(String[] args) {
		String str = "{([])}";
		Stack<Character> st = new Stack<Character>();
		for(int i =0; i<str.length();i++) {
			 char ch = str.charAt(i);
			 if(st.isEmpty()) {
				 st.push(ch);
			 }else if(ch == '{'|| ch == '('||ch == '[') {
				 st.push(ch);
			 }else if(ch=='}' && st.peek()=='{') {
				 st.pop();
			 }else if(ch==']' && st.peek()=='[') {
				 st.pop();
			 }else if(ch==')' && st.peek()=='(') {
				 st.pop();
			 }
		}
		
		if(st.isEmpty()) {
			System.out.println("Given String is well formed");
		}else {
			System.out.println("Given String is NOT well formed");
		}
	}

}
