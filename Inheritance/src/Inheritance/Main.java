package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat tim = new Cat("tim", 18, 100);
		Cat bob = new Cat("bob", 7);
		Cat joe = new Cat("joe");
		
		tim.speak();
		spaceUp(3);
		bob.speak();
		spaceUp(3);
		joe.speak();
	}

	public static void spaceUp(int range) {
		for(int i = 0 ; i < range; i++) {
			System.out.println();
		}
	}
	
}
