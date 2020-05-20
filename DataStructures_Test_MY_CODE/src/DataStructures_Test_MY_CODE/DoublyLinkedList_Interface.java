package DataStructures_Test_MY_CODE;

import java.util.ArrayList;
import java.util.List;

public interface DoublyLinkedList_Interface {
	/* HEAD NODE */
	
	DoublyLinkedNode head = null;
	
	/* HEAD NODE */
	
	/* GENERAL METHODS */
	
	int getLength();
	
	DoublyLinkedNode atIndex(int index);
	DoublyLinkedNode getLastNode();
	
	ArrayList<Integer> getNodeData();
	
	boolean contains(int data);
	
	/* GENERAL METHODS */

	/* INSERTION / DELETION */
	
	void append(int data);
	void prepend(int data);
	
	// the 'data' argument is for the node that we want to insert
	void insertAfterNode(DoublyLinkedNode searchNode, int data);
	void insertAfterNodeWithData(int searchData, int data);
	void insertAtIndex(int searchIndex, int data);
	
	void deleteNode(DoublyLinkedNode node);
	void deleteAtIndex(int index);
	void deleteNodeWithData(int data);
	
	/* INSERTION / DELETION */

	/* OTHERS */
	
	void nodeSwap(DoublyLinkedNode node_1, DoublyLinkedNode node_2);
	void reverse();
	
	void merge(boolean sort, DoublyLinkedList MERGE_DLLIST);
	void sort();
	
	void removeDuplicates();
	
	void moveTailToHead();
	int SumWithAnotherDoublyLinkedList(DoublyLinkedList SUM_DLLIST);
	
	ArrayList<List<Integer>> splitInHalf();
	ArrayList<ArrayList<Integer>> splitAfterNode(DoublyLinkedNode node);
	ArrayList<List<Integer>> splitAtIndex(int index);
	
	ArrayList<ArrayList<Integer>> pairsWithSum(int sum_value);
	
	/* OTHERS */
}
