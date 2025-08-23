package com.dsa.stack;
//Stack implementation which can store generic data

public class StackImplGeneric<T> {
	private T[] arr;
	private int top;
	private int capacity;
	
	public StackImplGeneric(int size){
		arr = (T[]) new Object[size];
		capacity = size;
		top = -1;
	}
	
	 public void push(T data){
		 if(top == capacity-1) {
			 System.out.println("Stack Overflow");
			 return;
		 }
		 arr[++top] = data;
		
	}
	 
	 public T pop(){
		 if(isEmpty()) {
			 System.out.println("Stack underflow");
			 return null;
		 }
		 return arr[top--];
	 }
	 
	 public T peek() {
		 if(isEmpty()) {
			 System.out.println("Stack is empty");
			 return null;
		 }
		 return arr[top];
	 }
	 
	 
	 public boolean isEmpty(){
		 return top == -1;
	 }
	
	public static void main(String[] args) {
		StackImplGeneric<String> stack = new StackImplGeneric<String>(5);
		stack.push("ram");
		stack.push("raj");
		stack.push("mohan");
		System.out.println("===========String=========");
		System.out.println("Stack top data : "+stack.peek());
		System.out.println("Stack pop  : "+stack.pop());
		System.out.println("Stack after deleting first data : "+stack.peek());
		System.out.println("Stack size : "+stack.isEmpty());
		
		System.out.println("===============Integer=========");
		StackImplGeneric<Integer> stack1 = new StackImplGeneric<Integer>(5);
		stack1.push(2);
		stack1.push(5);
		stack1.push(8);
		System.out.println("Stack top data : "+stack1.peek());
		System.out.println("Stack pop  : "+stack1.pop());
		System.out.println("Stack after deleting first data : "+stack1.peek());
		System.out.println("Stack size : "+stack1.isEmpty());
		
	}

}
