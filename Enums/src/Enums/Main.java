package Enums;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level lvl = Level.LOW;
		// String en = lvl.toString();
		// Level[] arr = Level.values();
		
		// System.out.println(Level.values());
		
		/* 
		 * My Code -- >
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		*/
		/*
		for(Level e:arr) {
			System.out.println(e);
		}
		
		if(lvl == Level.LOW) {
			System.out.println(lvl);
		}else if(lvl == Level.MEDIUM) {
			System.out.println(lvl);
		}else {
			System.out.println(lvl);
		}
		*/
		
		Level lvl = Level.LOW;
		System.out.println(Level.valueOf("LOW"));
		
		lvl.setLvl(5);
		
		System.out.println(Level.valueOf("LOW"));
	}

}
