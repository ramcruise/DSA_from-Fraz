package com.dsa.queue;

public class CircularQueueUsingArray {
	int[] Cqueue;
	int front,rear,capacity,size;
	
	public static void main(String[] args) {
		CircularQueueUsingArray cq = new CircularQueueUsingArray(4);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.enqueue(6);
		cq.display();
		System.out.println("Before removing");
		cq.dequeue();
		System.out.println("After dequeue");
		cq.display();
	}
	public CircularQueueUsingArray(int capacity) {
		this.capacity = capacity;
		Cqueue = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear+1)%capacity;
		Cqueue[rear]=data;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int data = Cqueue[front];
		front = (front+1)%capacity;
		size--;
		return data;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return Cqueue[front];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i = 0 ; i<size;i++) {
			System.out.print(Cqueue[(front+i)%capacity]);
		}
		System.out.println();
	}

}
