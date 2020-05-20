package DataStructures_Test_MY_CODE;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList DLL = new DoublyLinkedList();
		DoublyLinkedList DLL_2 = new DoublyLinkedList();
		
		for(int i = 1 ; i < 6; i++) {
			DLL.append(i);
		}
		
		DLL_2.append(4);
		DLL_2.append(1);
		
		/*
		System.out.println(DLL.getLength());
		System.out.println(DLL.atIndex(5).data);
		System.out.println(DLL.getLastNode().data);
		System.out.println(DLL.contains(3));
		System.out.println(DLL.contains(50));
		*/
		
		// DLL.insertAfterNode(DLL.head.next.next, 5000);
		// DLL.insertAfterNodeWithData(2, 5000);
		// DLL.insertAtIndex(3, 232);
		// DLL.deleteNode(DLL.getLastNode());
		// DLL.deleteAtIndex(DLL.getLength() - 1);
		// DLL.deleteNodeWithData(5);
		
		// System.out.println(DLL.checkPrevPointerForNodes());
		// DLL.nodeSwap(DLL.head, DLL.head.next.next.next);
		// DLL.reverse();
		// DLL.merge(true, DLL_2);
		// DLL.sort();
		// DLL.removeDuplicates();
		// DLL.moveTailToHead();
		// System.out.println(DLL.SumWithAnotherDoublyLinkedList(DLL_2));
		// System.out.println(DLL.splitInHalf());
		// System.out.println(DLL.splitAfterNode(DLL.head.next));
		// System.out.println(DLL.splitAtIndex(1));
		System.out.println(DLL.pairsWithSum(5));
		
		spaceUp();
		ArrayList<Integer> NODE_DATA = DLL.getNodeData();
		System.out.println(NODE_DATA);
	}

	public static void spaceUp() {
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println();
		}
	}
	
}
