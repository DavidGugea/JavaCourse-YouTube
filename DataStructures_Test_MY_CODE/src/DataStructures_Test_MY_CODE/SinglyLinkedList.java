package DataStructures_Test_MY_CODE;
import java.util.*;

public class SinglyLinkedList implements SinglyLinkedList_Interface{
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
			throw new ArrayIndexOutOfBoundsException(String.format("The given index was either too big or too small for the singly linked list. It must be something between 0 and %d. You gave : %d", this.getLength() - 1, index));
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
	
	public boolean contains(int data) {
		return this.getNodeData().contains(data);
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
	
	public void insertAfterNode(SinglyLinkedNode searchNode, int data) {
		// Start at the head node and iterate from the head node until we find the given node
		SinglyLinkedNode current = this.head;
		
		while(current != searchNode) {
			current = current.next;
		}
		
		// Create the insertNode and change the pointers of the needed nodes
		SinglyLinkedNode INSERTION_NODE = new SinglyLinkedNode(data);
		
		INSERTION_NODE.next = current.next;
		current.next = INSERTION_NODE.next;
		
	}
	
	public void insetAfterNodeWithData(int searchData, int data) {
		// Start to search at the head and iterate through the singly linked list until we get to the search data
		SinglyLinkedNode current = this.head;
		
		while(current.data != searchData) {
			current = current.next;
		}
		
		// Create the insertion node and change the pointers of the needed nodes
		SinglyLinkedNode INSERTION_NODE = new SinglyLinkedNode(data);
		INSERTION_NODE.next = current.next;
		current.next = INSERTION_NODE;
	}
	
	public void insertAtIndex(int searchIndex, int data) {
		// Check the given search index
		if(!(0 <= searchIndex && searchIndex < this.getLength())) {
			throw new ArrayIndexOutOfBoundsException(String.format("The given index was either too big or too small for the singly linked list. It must be something between 0 and %d. You gave : %d", this.getLength() - 1, searchIndex));
		}
		
		// Start at the head node and by keeping track of the given index iterate till we get to the given index and insert the new node with the given data
		SinglyLinkedNode current = this.head;
		int indexTrack = 0;
		
		while(indexTrack < searchIndex) {
			current = current.next;
			indexTrack++;
		}
		
		// Create the new insertion node and change the pointers of the needed nodes
		SinglyLinkedNode INSERTION_NODE = new SinglyLinkedNode(data);
		INSERTION_NODE.next = current.next;
		current.next = INSERTION_NODE;
	}
	
	public void deleteNode(SinglyLinkedNode node) {
		// Start at the head node and iterate till we get to the node before the node that we want to delete
		SinglyLinkedNode prev = null;
		SinglyLinkedNode current = null;
		
		while(current != node) {
			prev = current;
			current = current.next;
		}
		
		// Update the pointers
		prev.next = node.next;
	}
	
	public void deleteAtIndex(int index) {
		// Check the given index
		if(!(0 <= index && index < this.getLength())) {
			throw new ArrayIndexOutOfBoundsException(String.format("The given index was either too big or too small for the singly linked list. It must be a number between 0 and %d. You gave : %d", this.getLength() - 1, index));
		}
		
		// Find the node at the given index and delete it by starting at the head node and keeping track of the previous node & of the index
		SinglyLinkedNode prev = null;
		SinglyLinkedNode current = this.head;
		int indexTrack = 0;
		
		while(indexTrack < index) {
			prev = current;
			current = current.next;
			
			indexTrack++;
		}
		
		prev.next = current.next;
	}
	
	public void deleteNodeWithData(int data) {
		// Start at the head node and iterate until we find the node with the given data
		SinglyLinkedNode prev = null;
		SinglyLinkedNode current = this.head;
		
		while(current != null) {
			if(current.data == data) {
				break;
			}
			
			prev = current;
			current = current.next;
		}
		
		// Update the node pointers
		prev.next = current.next;
	}
	
	/* INSERTION / DELETION / SEARCH */
}
