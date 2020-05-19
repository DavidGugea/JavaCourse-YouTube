package WhatDoesSTATICMean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tim = new Dog("tim", 9);
		Dog bill = new Dog("bill", 10);
		
		Dog.count = 7;
		System.out.println(Dog.count);
	}

}
