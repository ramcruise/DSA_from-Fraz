package com.dsa.stack;

import java.util.Stack;

public class Evaluation_150 {
	 
	
	public static void main(String[] args) {
		String[] tokens = {"2","1","+","3","*"};
		int val = evalRPN(tokens);		
		System.out.println(val);
	}

	private static  int evalRPN(String[] tokens) {
		Stack<Integer> stk = new Stack<Integer>();
		
		for(String token : tokens) {
		if(token.equals("+") || token.equals("-") || token.equals("*") ||token.equals("/")) {
			int b = stk.peek();
			stk.pop();
			int a = stk.peek();
			stk.pop();
			stk.push(evaluate(a,b,token));
		 }else {
			 stk.push(Integer.parseInt(token));
			 
		 }
		}
		return stk.peek();
	}

	private static Integer evaluate(int a, int b, String op) {
		if(op.equals("+")) {
			return a+b;
		}
		if(op.equals("-")) {
			return a-b;
		}
		if(op.equals("*")) {
			return a*b;
		}
		return a/b;
	}

}
