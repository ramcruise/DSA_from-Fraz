package com.dsa.singlelyLinkedLIst;

public class SinglelyLinkedList {
	Node head;

	// Insert at the end into the linkedlist
	public void insertData(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	//deleting node by value
	public void delete(int key) {
		if(head==null)
			return;
		if(head.data==key) {
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next !=null && current.next.data !=key) {
			current = current.next;
		}
		
		if(current.next!=null) {
			current.next = current.next.next;
		}
		
	}
	
	public void display() {
		Node current = head;
		while(current !=null) {
			System.out.print(current.data +" -->");
			current = current.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		SinglelyLinkedList sl =new SinglelyLinkedList();
		sl.insertData(10);
		sl.insertData(20);
		sl.insertData(30);
		System.out.println("=====diplay=======");
		sl.display();
		sl.delete(30);
		System.out.println("=======after deleting node============");
		sl.display();
		
	}

}
