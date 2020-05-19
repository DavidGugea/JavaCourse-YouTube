package ForLoops_Continued;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 7, 3, 4, 5};
		String[] names = new String[5];
		
		/*
		int count = 0;
		for(int element:arr) {
			System.out.println(String.format("%d %d", element, count));
			count++;
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < names.length; i++) {
			System.out.print("Input: ");
			String input = sc.nextLine();
			names[i] = input;
		}
		
		for(String name:names) {
			System.out.println(name);
			
			if(name.contentEquals("tim")) {
				break;
			}
		}  
	}
}
