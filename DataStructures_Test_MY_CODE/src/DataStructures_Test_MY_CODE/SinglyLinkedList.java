package DataStructures_Test_MY_CODE;
import java.util.*;

public class SinglyLinkedList{
	/* HEAD NODE */
	
	public SinglyLinkedNode head = null;
	
	/* HEAD NODE */
	
	/* GENERAL METHODS */
	
	public int getLength() {
		// Check if the singly linked list has a head node, if it doesn't then return 0
		if(this.head == null) {
			return 0;
		}else {
			// Start at the head node and iterate through the list till we reach the end.
			SinglyLinkedNode current = this.head;
			int counter = 0;
			
			while(current.next != null) {
				counter++;
				current = current.next;
			}
			
			return counter;
		}
	}
	
	public SinglyLinkedNode atIndex(int index) {
		// Check the given index
		if(!(0 <= index && index < this.getLength())) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		// Start at the head node and iterate till we get to the given index
		SinglyLinkedNode current = this.head;
		int indexTrack = 0;
		
		while(indexTrack != index) {
			current = current.next;
			indexTrack++;
		}
		
		return current;
	}
	
	public SinglyLinkedNode getLastNode() {
		// Check if the singly linked list is empty or not. If it is empty return null
		if(this.head == null) {
			return null;
		}
		
		// Start at the head node an iterate to the end
		SinglyLinkedNode current = this.head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		return current;
	}
	
	public ArrayList<Integer> getNodeData(){
		// Create a new ArrayList<Integer> Object, start iterating from the head node and get to the end while adding new values to the ArrayList<Integer>.
		ArrayList<Integer> NODE_DATA = new ArrayList<Integer>();
		SinglyLinkedNode current = this.head;
		
		while(current != null) {
			NODE_DATA.add(current.data);
			current = current.next;
		}
		
		return NODE_DATA;
	}
	
	/* GENERAL METHODS */
	
	/* INSERTION / DELETION / SEARCH */
	
	public void append(int data) {
		// Check if the singly linked list is empty or not. If the singly linked list is empty ( this.head == null ) then we will need to create the head node.
		if(this.head == null) {
			this.head = new SinglyLinkedNode(data);
		}else {
			// We could just take the last node and change it's pointers ( .next ) but for practice, we will iterate
			// So, start at the head node and iterate to the end
			SinglyLinkedNode current = this.head;
			
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = new SinglyLinkedNode(data);
		}
	}
	
	public void prepend(int data) {
		// Check if the singly linked list is empty. If it is empty ( this.head == null )then we will need to create the head node.
		if(this.head == null) {
			this.head = new SinglyLinkedNode(data);
		}else {
			// Change the pointers of the head node and of the new node that we will want to prepend, and after the new head pointer is set, update the 'head' property ( this.head ) property of the main SinglyLinkedList ( this )
			SinglyLinkedNode PREPEND_NODE = new SinglyLinkedNode(data);
			PREPEND_NODE.next = this.head;
			
			this.head = PREPEND_NODE;
		}
		
	}
	
	/* INSERTION / DELETION / SEARCH */
}
