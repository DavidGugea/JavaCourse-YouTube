package CreatingClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tim = new Dog("tim", 4);
		tim.speak();
		Dog bill = new Dog("bill", 7);
		bill.speak();
		Dog bob = new Dog("bob", 11);
		bob.speak();
		
		spaceUp(3);
		
		// int x = tim.getAge();
		// System.out.println(x);
		
		// tim.setAge(10);
		// tim.speak();
		
		// x = tim.getAge();
		// System.out.println(x);
	}
	
	public static void spaceUp(int range) {
		for(int i = 0 ; i < range; i++) {
			System.out.println();
		}
	}
	
}
