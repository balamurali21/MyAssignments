package week1.day1;

public class Bike {

	public void startEngine() {
		System.out.println("Engine Starts");
	}
	public void turnonHeadlight() {
		System.out.println("Head Light is ON");

	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.applyBreak();
		c.soundHorn();
		
		Bike b=new Bike();
		b.startEngine();
		b.turnonHeadlight();
		
	}
}
