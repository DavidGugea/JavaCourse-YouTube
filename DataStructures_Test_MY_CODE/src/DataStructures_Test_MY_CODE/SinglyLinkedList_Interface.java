package DataStructures_Test_MY_CODE;
import java.util.*;

public interface SinglyLinkedList_Interface{
	/* HEAD NODE */
	
	SinglyLinkedNode head = null;
	
	/* HEAD NODE */
	
	/* GENERAL METHODS */
	
	int getLength();
	
	SinglyLinkedNode atIndex(int index);
	SinglyLinkedNode getLastNode();
	
	ArrayList<Integer> getNodeData();
	
	boolean contains(int data);
	
	/* GENERAL METHODS */

	/* INSERTION / DELETION / SEARCH */
	
	void append(int data);
	void prepend(int data);
	
	// the 'data' argument is for the node that we want to insert
	void insertAfterNode(SinglyLinkedNode searchNode, int data);
	void insertAfterNodeWithData(int searchData, int data);
	void insertAtIndex(int searchIndex, int data);
	
	void deleteNode(SinglyLinkedNode node);
	void deleteAtIndex(int index);
	void deleteNodeWithData(int data);
	
	/* INSERTION / DELETION / SEARCH */

	/* OTHERS */
	
	void nodeSwap(SinglyLinkedNode node_1, SinglyLinkedNode node_2);
	void reverse();
	
	void merge(boolean sort, SinglyLinkedList MERGE_SLLIST);
	void sort();
	
	void removeDuplicates();
	
	void moveTailToHead();
	int SumWithAnotherSinglyLinkedList(SinglyLinkedList SUM_SLLIST);
	
	ArrayList<List<Integer>> splitInHalf();
	ArrayList<ArrayList<Integer>> splitAfterNode(SinglyLinkedNode node);
	ArrayList<List<Integer>> splitAtIndex(int index);
	
	ArrayList<ArrayList<Integer>> pairsWithSum(int sum_value);
	
	/* OTHERS */
	
	// THROW CUSTOM EXCEPTION -- >
	
}
