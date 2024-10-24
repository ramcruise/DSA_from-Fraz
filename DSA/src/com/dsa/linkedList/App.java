package com.dsa.linkedList;

public class App {
	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 5;
		
		Node nodeC = new Node();
		nodeC.data = 6;
		Node nodeD = new Node();
		nodeD.data = 9;
		
		Node nodeE = new Node();
		nodeE.data = 90;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		
		traverseList(nodeA);
	}
	
	public static void traverseList(Node head) {
		Node currentNode = head;

		while(currentNode !=null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
			
		}
	}

}
