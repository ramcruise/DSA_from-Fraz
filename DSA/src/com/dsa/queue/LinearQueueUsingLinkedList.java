package com.dsa.queue;

public class LinearQueueUsingLinkedList {
	Node front,rear;
	
	public LinearQueueUsingLinkedList() {
		front = rear = null;
	}
	
	public static void main(String[] args) {
		LinearQueueUsingLinkedList lq = new LinearQueueUsingLinkedList();
		lq.enqueue(5);
		lq.enqueue(52);
		lq.enqueue(15);
		lq.enqueue(45);
		System.out.println("Before dequeueing ");
		lq.display();
		System.out.println("After dequeueing");
		lq.dequeue();
		lq.display();
	}
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int item = front.data;
		front = front.next;
		if(front == null)
			rear = null;
		return item;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return front.data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		Node temp = front;
		System.out.print("Queue : ");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

}
