package DataStructures_Test_MY_CODE;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList SLL = new SinglyLinkedList();
		for(int i = 1 ; i <= 10; i++) {
			SLL.append(i);
		}
		spaceUp();
		
		// SLL.insertAfterNode(SLL.head.next.next.next, 5000);
		// SLL.insertAfterNodeWithData(4, 5000);
		// SLL.insertAtIndex(3, 5000);
		// SLL.deleteNode(SLL.getLastNode());
		// SLL.deleteAtIndex(9);
		// SLL.deleteNodeWithData(10);
		
		spaceUp();
		ArrayList<Integer> x = SLL.getNodeData();
		System.out.println(x);
	}

	public static void spaceUp() {
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println();
		}
	}
	
}
