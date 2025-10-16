package com.dsa.queue;

public class LinearQueueUsingArray {
	int[] linearQueue;
	int front, rear, capacity;

	public LinearQueueUsingArray(int capacity) {
		linearQueue = new int[capacity];
		this.capacity = capacity;
		front = 0;
		rear = -1;
	}

	public static void main(String[] args) {
		LinearQueueUsingArray lq = new LinearQueueUsingArray(4);
		lq.enqueue(2);
		lq.enqueue(4);
		lq.enqueue(5);
		lq.enqueue(6);
		System.out.println("after adding the data");
		lq.display();
		lq.dequeue();
		System.out.println("after removing the data");
		lq.display();
		
	}

	public boolean isEmpty() {
		return front > rear;
	}

	public boolean isFull() {
		return rear == capacity - 1;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear++;
		linearQueue[rear] = data;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is full");
			return -1;
		}
		 int item= linearQueue[front];
		 front++;
		return item;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is full");
			return -1;
		}
		return linearQueue[front];
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is full");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.println(linearQueue[i]);
		}
	}

}
