package Inheritance;

public class Cat extends Dog {
	private int food;
	
	public Cat(String name, int age, int food) {
		super(name, age);
		
		this.food = food;
	}
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public Cat(String name) {
		super(name, 0);
		this.food = 50;
	}
	
	public void speak() {
		System.out.println(String.format("Meow my name is %s and I get fed %d", this.name, this.age));
	}
	
	public void eat(int x) {
		this.food -= x;
	}
}
