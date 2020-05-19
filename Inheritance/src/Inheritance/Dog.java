package Inheritance;

public class Dog {
	
	protected String name;
	protected int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		
		// add2();
		// speak();
	}
	
	public void speak() {
		System.out.println(String.format("I am %s and I am %d years old", this.name, this.age));
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	private int add2() {
		return this.age + 2;
	}
}