package com.dsa.queue;

public class CircularQueueUsingLinkedList {
	Node front , rear ;
	
	 CircularQueueUsingLinkedList() {
		 front=rear=null;
	}
	 
	 public static void main(String[] args) {
		 CircularQueueUsingLinkedList cq = new CircularQueueUsingLinkedList();
		 cq.enqueue(12);
		 cq.enqueue(32);
		 cq.enqueue(15);
		 cq.enqueue(78);
		 cq.enqueue(90);
		 cq.enqueue(17);
		 cq.enqueue(8);
		 System.out.println("Before dequeueing : ");
		 cq.display();
		 cq.dequeue();
		 System.out.println("After dequeueing : ");
		 cq.display();
	 }
	 
	 public boolean isEmpty() {
		 return front==null;
	 }
	 
	 public void enqueue(int data) {
		 Node newNode = new Node(data);
		 if(rear==null) {
			 front=rear = newNode;
			 rear.next = front;
			 
		 }else {
			 rear.next = newNode;
			 rear = newNode;
			 rear.next=front;
		 }
	 }
	 
	 public int dequeue() {
		 if(isEmpty()) {
			 System.out.println("Queue is empty");
			 return -1;
		 }
		 int item = front.data;
		 if(front==rear) {
			 front = rear = null;
		 }else {
			front = front.next;
			rear.next = front;
		 }
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
		 System.out.println("Queue : ");
		 do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != front);
	        System.out.println();

	 }

}
