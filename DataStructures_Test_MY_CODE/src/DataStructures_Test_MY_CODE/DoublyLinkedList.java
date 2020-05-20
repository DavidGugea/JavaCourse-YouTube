package DataStructures_Test_MY_CODE;
import java.util.*;

public class DoublyLinkedList{
	/* HEAD */
	
	DoublyLinkedNode head = null;
	
	/* HEAD */
	
	/* GENERAL METHODS */
	
	public int getLength() {
		// Check if the doubly linked list has a head node
		if(this.head == null) {
			return 0;
		}else {
			// Start at the head node and iterate through the list while keeping track of how the counter
			int counter = 0;
			DoublyLinkedNode current = this.head;
			
			while(current != null) {
				current = current.next;
				counter++;
			}
			
			return counter;
		}
	}
	
	
	public DoublyLinkedNode atIndex(int index) {
		// Check the given index
		if(!(0 <= index && index < this.getLength())) {
			throw new ArrayIndexOutOfBoundsException(String.format("The given index was either too big or too small for the doubly linked list. It must be a number between 0 and %d. You gave : %d", this.getLength() - 1, index));
		}
		
		// Start at the head node and iterate through the list while keeping track of the current node and of the index
		DoublyLinkedNode current = this.head;
		int indexTrack = 0;
		
		while(indexTrack < index) {
			current = current.next;
			indexTrack++;
		}
		
		return current;
	}
	
	public DoublyLinkedNode getLastNode() {
		// Start at the head node and iterate till we reach the end
		DoublyLinkedNode current = this.head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		return current;
	}
	
	public ArrayList<Integer> getNodeData(){
		// Check if the doubly linked list is empty or not
		if(this.head == null) {
			return new ArrayList<Integer>();
		}else {
			// Start at the head node and iterate to the end while adding the node data from the nodes inside the ArrayList<Integer> object
			ArrayList<Integer> NODE_DATA = new ArrayList<Integer>();
			DoublyLinkedNode current = this.head;
			
			while(current != null) {
				NODE_DATA.add(current.data);
				current = current.next;
			}
			
			return NODE_DATA;
		}
	}
	
	public boolean contains(int data) {
		return this.getNodeData().contains(data);
	}
	
	/* GENERAL METHODS */
	
	/* INSERTION / DELETION */
	
	public void append(int data) {
		// Check if the doubly linked list has a head node or not. If it doesn't have a head node then create one 
		if(this.head == null) {
			this.head = new DoublyLinkedNode(data);
		}else {
			// Iterate to the end of the list and append the new node
			DoublyLinkedNode current = this.head;
			
			while(current.next != null) {
				current = current.next;
			}
			
			// Append the node
			DoublyLinkedNode APPEND_NODE = new DoublyLinkedNode(data);
			APPEND_NODE.prev = current;
			current.next = APPEND_NODE;
		}
	}
	
	public void prepend(int data) {
		// Check if the doubly linked list has a last node or not. If it doesn't have a last node then create one
		if(this.head == null) {
			this.head = new DoublyLinkedNode(data);
		}else {
			DoublyLinkedNode PREPEND_NODE = new DoublyLinkedNode(data);
			this.head.prev = PREPEND_NODE;
			PREPEND_NODE.next = this.head;
			
			// Update the head node
			this.head = PREPEND_NODE;
		}
	}
	
	/* INSERTION / DELETION */
}
