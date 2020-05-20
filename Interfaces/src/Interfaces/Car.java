package Interfaces;

public class Car implements Vehicle{
	private int gear = 1;
	private int speed = 0;
	
	
	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	public void speedUp(int change) {
		this.speed += change;
	}
	
	public void slowDown(int change) {
		this.speed -= change;
	}
	
	public void display() {
		System.out.println(String.format("I am a car, going %d km / h and I am in gear %d", this.speed, this.gear));
		out();
	}
}
