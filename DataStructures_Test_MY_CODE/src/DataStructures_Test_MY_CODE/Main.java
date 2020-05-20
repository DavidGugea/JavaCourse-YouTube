package DataStructures_Test_MY_CODE;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList DLL = new DoublyLinkedList();
		
		for(int i = 0 ; i < 10 ; i++) {
			DLL.append(i);
		}
		
		/*
		System.out.println(DLL.getLength());
		System.out.println(DLL.atIndex(5).data);
		System.out.println(DLL.getLastNode().data);
		System.out.println(DLL.contains(3));
		System.out.println(DLL.contains(50));
		*/
		
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
