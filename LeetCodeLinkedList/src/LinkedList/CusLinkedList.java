package LinkedList;


class LinkedList {

	public Node head;
	private int size;
	
	LinkedList() {
		this.size = 0;
	}
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		if(head.next == null) {
			head.next = newNode;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
		
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		size--;
		// else
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is already empty");
			return;
		}
		
		size--;
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		
		Node lastNode = head;
		while(lastNode.next.next != null) {
			lastNode = lastNode.next;
		}
		
		lastNode.next = null;
	}
	
	public int getSize() {
		System.out.println("Size is: " + size);
		return size;
	}
	
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node curentNode = head;
		while(curentNode != null) {
			System.out.print(curentNode.data + " -> ");
			curentNode = curentNode.next;
		}
		
		System.out.println("NULL");
	} 

}

public class CusLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addLast(4);
		list.addFirst(5);
		list.addFirst(6);
		list.addFirst(7);
		list.addLast(8);
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		list.getSize();
		
	}
	
	
}
