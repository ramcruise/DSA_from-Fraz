package com.dsa.stack;

import java.util.Stack;

//Stack implementation using array (it can store int data only, not generic)
public class ImplementationOfStack {
	private int[] arr;
	private int top;
	private int capacity;

	ImplementationOfStack(int size) {
		arr = new int[size];
		capacity= size;
		top = -1;
	}

	public void push(int data) {
		if(top == capacity -1) {
			System.out.println("Stack overflow");
			return;
		}
		arr[++top]=data;
	}
	
	 public int pop(){
		 if(isEmpty()) {
			 System.out.println("stack underflow");
			 return -1;
		 }
		 return arr[top--];
	}
	 
	 public int peek(){
		 if(isEmpty()) {
			 System.out.println("stack is empty");
			 return -1;
		 }
		 return arr[top];
	 }
	 
  public boolean isEmpty() {
	  return top == -1;
  }
	public static void main(String[] args) {
		ImplementationOfStack stack = new ImplementationOfStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Top element : "+stack.peek());
		System.out.println("Popped : "+stack.pop());
		System.out.println("Top element after pop : "+stack.peek());
		System.out.println("Is empty : "+stack.isEmpty());
		
	}

}
