package Mediam;

import LinkedList.CusLinkedList;
import LinkedList.LinkedList;

public class Swap_Nodes_in_Pairs_24 {

	 private static void swap(ListNode a, ListNode b) {
	        if(a == null || b == null) {
	            return;
	        }
	        int temp = a.val;
	        a.val = b.val;
	        b.val = temp;
	    }
	    
	    public static CusLinkedList swapPairs(CusLinkedList head) {
	        
	        if(head == null || head.next == null) {
	            return head;
	        }
	        
	        ListNode odd = head;
	        ListNode even = head.next;
	        
	        while(even != null && (odd.next != null && even.next != null)) {
	            swap(even, odd);
	            even = even.next.next;
	            odd = odd.next.next;
	        }
	        swap(even, odd);
	        return head;
	        
	    }
	    
	    
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
	    	
		}
}
