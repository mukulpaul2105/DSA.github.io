package Youtube.ApnaCollege.LinkedList1;


class LinkedList1 {
	
	Node head;
	private int size;
	
	LinkedList1() {
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
	
	
	public void addFirst(int item) {
		Node newNode = new Node(item);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	
	public void addLast(int item) {
		Node newNode = new Node(item);
		if(head == null) {
			head = newNode;
			return;
		}
		
		if(head.next == null) {
			head.next = newNode;
			return;
		}
		
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		
		lastNode.next = newNode;
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
		
	}
	
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next == null) {
			head.next = null;
			return;
		}
		
		Node sLastNode = head;
		while(sLastNode.next.next != null) {
			sLastNode = sLastNode.next;
		}
		sLastNode.next = null;
	}
	
	public int getSize() {
		System.out.println("Size: " + size);
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
	
	
	public void reverseUsingIterative() {
		if(head == null || head.next == null) {
			return;
		}
		
		
		Node prevNode = head;
		Node currentNode = head.next;
		while(currentNode != null) {
			Node nextNode = currentNode.next;
			currentNode.next = prevNode;
			
			
			// update
			prevNode = currentNode;
			currentNode = nextNode;
		}
		
		
		head.next = null;
		head = prevNode;
	}
	
	public Node reverseUsingRecursion(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node newHead = reverseUsingRecursion(head.next);
		head.next.next = head;
		head.next = null;
		
		return newHead;
	}
}




public class ReverseLL {

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(4);
		list.printList();
//		list.deleteFirst();
//		list.printList();
//		list.deleteLast();
//		list.printList();
		list.getSize();
		list.reverseUsingIterative();
		list.printList();
		
		list.head = list.reverseUsingRecursion(list.head);
		list.printList();
	}
}
