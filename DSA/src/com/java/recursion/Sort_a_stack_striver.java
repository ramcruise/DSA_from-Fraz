package com.java.recursion;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/sort-a-stack/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sort-a-stack
public class Sort_a_stack_striver {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(2);
		s.push(32);
		s.push(3);
		s.push(41);
		Stack sortVal = sort(s);
		System.out.println(sortVal);
	}
	public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty() || s.size() == 1){
            return s;
        }
        int top = s.pop();
        sort(s);
        insert(top,s);
        return s;
    }
    
    private static void insert(int element, Stack<Integer> s){
        if(s.isEmpty() || s.peek() >= element){
            s.push(element);
            return;
        }
        int top = s.pop();
        insert(element, s);
        s.push(top);
    }
}
