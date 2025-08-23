package com.dsa.stack;
//Stack impl using LinkedList
public class StackImpl {

	public static void main(String[] args) {
		StackImpl st = new StackImpl();
		st.push(5);
		st.push(6);
		st.push(7);
		System.out.println("top data : "+st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		
	}
	
	
	class Node{
		int value;
		Node next;
		public Node(int data) {
			this.value = data;
		}
	}
	
	private Node top;
	
	public void push(int data) {
		Node newNode  = new Node(data); 
		newNode.next = top;
		top = newNode;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		int value = top.value;
		top=top.next;
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return top.value;
	}
	

}
