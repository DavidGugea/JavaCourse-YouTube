package DataStructures_Test_MY_CODE;
import java.util.*;

public interface SinglyLinkedList_Interface {
	/* HEAD NODE */
	
	SinglyLinkedNode head = null;
	
	/* HEAD NODE */
	
	/* GENERAL METHODS */
	
	int getLength();
	
	SinglyLinkedNode atIndex(int index);
	SinglyLinkedNode getLastNode();
	
	ArrayList<Integer> getNodeData();
	
	/* GENERAL METHODS */

	/* INSERTION / DELETION / SEARCH */
	
	void append(int data);
	void prepend(int data);
	
	void insertAfterNode(SinglyLinkedNode node);
	void insertAfterNodeWithData(int data);
	void insertAtIndex(int index);
	
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
	void rotate(int rotationValue);
	
	void moveTailToHead();
	void SumWithAnotherSinglyLinkedList(SinglyLinkedList SUM_SLLIST);
	
	ArrayList<ArrayList<Integer>> splitInHalf();
	ArrayList<ArrayList<Integer>> splitAfterNode(SinglyLinkedNode node);
	ArrayList<ArrayList<Integer>> splitAtIndex(int index);
	
	ArrayList pairsWithSum(int sum_value);
	
	/* OTHERS */
}
