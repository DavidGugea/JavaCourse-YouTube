package MapsExample;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {-99, 5, 6, 3, 2, 1, 7, 8, 0};
		
		Arrays.sort(x, 3, 5);
		
		// MY CODE :
		String ARRAY_DATA_STRING = new String();
		
		for(int num:x) {
			if(num != x[x.length - 1]) {
				ARRAY_DATA_STRING += String.format(" %d ->", num);	
			}
			else {
				ARRAY_DATA_STRING += String.format(" %d", num);
			}
		};
		
		System.out.println(ARRAY_DATA_STRING);
		
		/*
		Map m = new HashMap();
		String str = "hello my name is tim and i am cool";
		
		for(char x:str.toCharArray()) {
			if(m.containsKey(x)) {
				int old = (Integer)m.get(x);
				m.put(x, old + 1);
			}
			else {
				m.put(x,  1);
			}
		}
		
		m.remove(' ');
		
		
		System.out.println(m);
		*/
		/*
		 * PROBLEM : Get a string and using a HashMap put all the chars as values and keys at the number of times each char repeats itself.
		 * This is *MY CODE* :
		 * 
		Map STRING_HASH_MAP = new HashMap();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a string -- > ");
		String givenString = sc.nextLine();
		
		for(int i = 0 ; i < givenString.length(); i++) {
			char currentChar = givenString.charAt(i);
			if(STRING_HASH_MAP.containsKey(currentChar)) {
				int counter = (Integer)STRING_HASH_MAP.get(currentChar);
				STRING_HASH_MAP.put(currentChar, counter + 1);
			}else {
				STRING_HASH_MAP.put(currentChar, 1);
			}
		}
		
		System.out.println(STRING_HASH_MAP);
		*/
	}

}
