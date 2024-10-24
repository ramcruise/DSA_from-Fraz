package com.dsa.stack;

import java.util.Stack;

public class MinStack_155 {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
	public static void main(String[] args) {

	}
	
	public MinStack_155() {
        
    }
    
    public void push(int val) {
        s1.push(val);
        if(s2.size() == 0)
        	s2.push(val);
        else
        	s2.push(Math.min(val, s2.peek()));
    }
    
    public void pop() {
        s1.pop();
        s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }

}
