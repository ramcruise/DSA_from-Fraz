package com.dsa.singlelyLinkedLIst;

public class DoublyLinkedList {
	Node1 head = null;
	Node1 tail = null;

	// insert data at end into linked list
	public void append(int data) {
		Node1 newNode = new Node1(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	// insert at begining into list
	public void prepend(int data) {
		Node1 newNode = new Node1(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}

	// delete the given node
	public void delete(int key) {
		Node1 current = head;
		while (current != null) {
			if (current.data == key) {
				if (current == head)
					head = current.next;
				if (current == tail)
					tail = current.prev;
				if (current.prev != null)
					current.prev.next = current.next;
				if (current.next != null)
					current.next.prev = current.prev;
				return;
			}
			current = current.next;
		}
	}

	// diaplay forward
	public void forward() {
		Node1 current = head;
		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.println();
	}

	// display backward
	public void backward() {
		Node1 current = tail;
		while (current != null) {
			System.out.print(current.data + " -->");
			current = current.prev;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.append(10);
		dl.append(20);
		dl.append(30);
		dl.forward();
		dl.backward();
		dl.delete(20);
		dl.forward();

	}

}
