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
			
			while(current != null) {
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
		// Create the insertNode and change the pointers of the needed nodes
		SinglyLinkedNode INSERTION_NODE = new SinglyLinkedNode(data);
		
		INSERTION_NODE.next = searchNode.next;
		searchNode.next = INSERTION_NODE;
		
	}
	
	public void insertAfterNodeWithData(int searchData, int data) {
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
		
		while(indexTrack < searchIndex - 1) {
			current = current.next;
			indexTrack++;
		}
		
		// Create the new insertion node and change the pointers of the needed nodes
		SinglyLinkedNode INSERTION_NODE = new SinglyLinkedNode(data);
		INSERTION_NODE.next = current.next;
		current.next = INSERTION_NODE;
		
		if(searchIndex == 0) {
			this.head = INSERTION_NODE;
		}
	}
	
	public void deleteNode(SinglyLinkedNode node) {
		// Check if the given node is the head node
		if(this.head == node) {
			this.head = this.head.next;
		}else {
			// Start at the head node and iterate till we get to the node before the node that we want to delete
			SinglyLinkedNode prev = null;
			SinglyLinkedNode current = this.head;
			
			while(current != node) {
				prev = current;
				current = current.next;
			}
			
			// Update the pointers
			prev.next = node.next;
		}
	}
	
	public void deleteAtIndex(int index) {
		// Check if the given index is 0, so if the node that must be deleted is the head node
		if(index == 0) {
			this.head = this.head.next;
		}else {
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
	}
	
	public void deleteNodeWithData(int data) {
		// Check if the given data is equal to the data that the head node has, so if the node that must be deleted is the head node or not
		if(this.head.data == data) {
			this.head = this.head.next;
		}else {
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
	}
	
	/* INSERTION / DELETION / SEARCH */
	
	/* OTHERS */
	
	public void nodeSwap(SinglyLinkedNode node_1, SinglyLinkedNode node_2) {
		// Swap the .data value between the two nodes
		int temp_data = node_1.data;
		node_1.data = node_2.data;
		node_2.data = temp_data;
	}
	
	public void reverse() {
		// Change the pointers
		SinglyLinkedNode prev = null;
		SinglyLinkedNode current = this.head;
		
		while(current != null) {
			SinglyLinkedNode temp_next = current.next;
			
			current.next = prev;
			
			prev = current;
			current = temp_next;
		}
		
		// Update the head node to be the 'last' node;
		this.head = prev;
	}
	
	public void merge(boolean sort, SinglyLinkedList MERGE_SLLIST) {
		// the "sort" data will sort all the node data from the list after we will merge all the data with the MERGE_SLLIST data
		
		// Start by merging the data with the data from the MERGE_SLLIST
		for(int NODE_DATA:MERGE_SLLIST.getNodeData()) {
			this.append(NODE_DATA);
		}
		
		if(sort) {
			// Store all the node data in an ArrayList<Integer> and sort that array. After that, rebuild the singly linked list.
			ArrayList<Integer> NODE_DATA = this.getNodeData();
			Collections.sort(NODE_DATA);
			
			// Rebuild the singly linked list.
			this.head = new SinglyLinkedNode(NODE_DATA.get(0));
			
			for(int SORTED_NODE_DATA:NODE_DATA.subList(1, NODE_DATA.size())) {
				this.append(SORTED_NODE_DATA);
			}
		}
	}
	
	public void sort() {
		// Sort the node data list
		ArrayList<Integer> SORTED_NODE_DATA = this.getNodeData();
		Collections.sort(SORTED_NODE_DATA);
		
		// Rebuild the singly linked list
		this.head = new SinglyLinkedNode(SORTED_NODE_DATA.get(0));
		
		for(int NODE_DATA:SORTED_NODE_DATA.subList(1, SORTED_NODE_DATA.size())) {
			this.append(NODE_DATA);
		}
	}
	
	public void removeDuplicates() {
		// Store all the node data in a hash map with all the times it is duplicated. ( NODE DATA ( key ) -> REPETITIONS ( values ) )
		HashMap repetitions = new HashMap();
		ArrayList<Integer> NODE_DATA = this.getNodeData();
		
		for(int data:NODE_DATA) {
			// Count how many times the data repeats itself in the NODE_DATA ArrayList<Integer>
			int counter = 0;
			for(int d:NODE_DATA) {
				if(d == data) {
					counter++;
				}
			}
			
			// We write check for counter - 1 because if the data appears only once in the ArrayList<Integer> then that means that we don't have any repetitions, so that means that it doesn't repeat itself. If we have '2', then counter - 1 is 1 so we have 1 duplicate for that number
			System.out.println(String.format("%d -- > %d", data, counter));
			if(counter - 1 > 0) {
				// We write counter - 1 because we need the number of times that it is repetead, not how many times it appears in the singly linked list.
				repetitions.put(data, counter - 1); 
			}
		}
		
		// Remove the duplicates based on the data store in the repetitons HashMap
		for(Object data_duplicate:repetitions.keySet()) {
			// Convert the data_duplicate to integer 
			int data_DELETE = (int)data_duplicate;
			
			// Remove it's duplicates
			for(int i = 0 ; i < (int)repetitions.get(data_duplicate); i++) {
				this.deleteNodeWithData(data_DELETE);
			}
		}
	}
	
	public void moveTailToHead() {
		// Get the last node
		SinglyLinkedNode prev = null;
		SinglyLinkedNode current = this.head;
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		current.next = this.head.next;
		prev.next = this.head;
		this.head.next = null;
		this.head = current;
	}
	
	public int SumWithAnotherSinglyLinkedList(SinglyLinkedList SUM_SLLIST) {
		// Get all the node data from both singly linked list and add all the node data from both of them.
		int sum = 0;
		
		for(int data:this.getNodeData()) {
			sum += data;
		}
		for(int data:SUM_SLLIST.getNodeData()) {
			sum += data;
		}
		
		return sum;
	}
	
	public ArrayList<List<Integer>> splitInHalf(){
		// Get all the node data in two ArrayList<Integer> objects.
		ArrayList<List<Integer>> halves = new ArrayList<List<Integer>>();
		int FULL_LENGTH = this.getNodeData().size();
		
		halves.add(this.getNodeData().subList(0, FULL_LENGTH / 2));
		halves.add(this.getNodeData().subList(FULL_LENGTH/2, FULL_LENGTH));
		
		return halves;
	}
	
	public ArrayList<ArrayList<Integer>> splitAfterNode(SinglyLinkedNode node){
		// Create the array lists ( both types : ArrayList<ArrayList<Integer>> & ArrayList<Integer>
		ArrayList<ArrayList<Integer>> partitions = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> firstPartition = new ArrayList<Integer>();
		ArrayList<Integer> secondPartition = new ArrayList<Integer>();
		
		// Put the nodes in both partitions ( firstPartition & secondPartition )
		SinglyLinkedNode current = this.head;
		boolean passedTheGivenNode = false;
		
		while(current != null) {
			if(passedTheGivenNode) {
				secondPartition.add(current.data);
			}else {
				firstPartition.add(current.data);
			}
			
			if(current == node) {
				passedTheGivenNode = true;
			}
			
			current = current.next;
		}
		
		// Add both partitions into the big ArrayList<ArrayList<Integer>>
		partitions.add(firstPartition);
		partitions.add(secondPartition);
		
		// Return the big partition
		return partitions;
	}
	
	public ArrayList<List<Integer>> splitAtIndex(int index){
		ArrayList<List<Integer>> partitions = new ArrayList<List<Integer>>();
		
		partitions.add(this.getNodeData().subList(0, index));
		partitions.add(this.getNodeData().subList(index, this.getNodeData().size()));
		
		return partitions;
	}
	
	public ArrayList<ArrayList<Integer>> pairsWithSum(int sum_value){
		// Get all the pairs in one big ArrayList<ArrayList<Integer>>
		ArrayList<ArrayList<Integer>> pairs = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> NODE_DATA = this.getNodeData();
		
		for(int mainPivot:NODE_DATA) {
			for(int secondaryValue:NODE_DATA) {
				// Create a new pair and add both values to it. After that add the pair to the ArrayList<ArrayList<Integer>> object.
				ArrayList<Integer> pair = new ArrayList<Integer>();
				
				pair.add(mainPivot);
				pair.add(secondaryValue);
				
				pairs.add(pair);
			}
		}
		
		// Check all the pairs ArrayList for pairs that summed return the given sum_value;
		ArrayList<ArrayList<Integer>> pairsWithSum = new ArrayList<ArrayList<Integer>>();
		
		for(ArrayList<Integer> pair:pairs) {
			if(pair.get(0) + pair.get(1) == sum_value && !pairsWithSum.contains(pair)) {
				pairsWithSum.add(pair);
			}
		}
		
		return pairsWithSum;
	}
	
	/* OTHERS */
}
