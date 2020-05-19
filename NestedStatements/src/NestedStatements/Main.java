package NestedStatements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input your age : ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		if(age >= 18) {
			System.out.print("Input your fav food : ");
			String food = sc.nextLine();
			
			if(food.contentEquals("pizza")) {
				System.out.println("Mine too.");
			}else {
				System.out.println("Not mine");
			}
		}
		else if(age >= 13) {
			System.out.println("You are a teenager.");
		}
		else {
			System.out.println("You are not a teenager or an adult.");
		}
	}

}
