package SetsAndLists;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Set<Integer> t = new LinkedHashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		t.remove(9);
		
		int x = t.size();
		
		
		System.out.println(x);
		System.out.println(t);
		*/
		
		LinkedList<Integer> t = new LinkedList<Integer>();
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		
		t.get(0);
		t.set(1, 5);
		t.size();
		
		System.out.println(t.subList(1, 3));
	}

}
