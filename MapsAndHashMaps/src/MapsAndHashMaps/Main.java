package MapsAndHashMaps;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new LinkedHashMap();
		m.put("tim", 5);
		m.put("joe", "x");
		m.put("a", "b");
		
		m.containsValue("b");
		m.containsKey(5);
		

		
		/*
		m.put(11, 999);
		m.put(11, 998);
		*/
		
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.get(5));
		System.out.println(m.isEmpty());
		System.out.println(m);
		
	}

}
