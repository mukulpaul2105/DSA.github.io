package Youtube.ApnaCollege.LinkedList1;

/*
 * Four Operations
 *  1. Insertion
 *  2. Print
 *  3. Delete
 *  4. Size
 */

public class LinkdList {

	Node head;
	private int size;
	
	LinkdList() {
		this.size = 0;
	}
	
	class Node {
		String data;
		Node next;
		
		
		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	
	/*
	 *  Add / Insertion
	 *  1. First,
	 *  2. Last
	 */
	public void addFirst(String data) {
		// Checking if the Linked list does exists or not. If not than create a new one
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	/*
	 * Add Last
	 */
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
	}
	
	/*
	 *  Print
	 */
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
	
	/*
	 *  Delete First
	 */
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		size--;
		// else
		head = head.next;
	}
	
	/*
	 *  Delete Last
	 */
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		size--;
		
		// If the list has only one element
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
		
	}
	
	/*
	 *  Get Size
	 */
	
	public int getSize() {
		System.out.println("Size of the List is: " + size);
		return size;
	}
	
	
	public static void main(String[] args) {
		
		LinkdList list = new LinkdList();
		list.addFirst("Shradha");
		list.addFirst("College");
		list.addFirst("Apna");
		list.addLast("Youtube");
		list.printList();
		list.deleteFirst();
		System.out.println();
		list.printList();
		list.deleteLast();
		list.printList();
		list.getSize();
		
	}
	
}
