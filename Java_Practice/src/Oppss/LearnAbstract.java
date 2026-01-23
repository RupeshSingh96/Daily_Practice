package Oppss;

public class LearnAbstract {

	public static void main(String[] args) {
		Car c= new Car();
		c.tailLight();
		c.tyre();
		
		Bike b = new Bike();
		b.tyre();
		b.tailLight();

	}
}
abstract class Vehicle{
	
	abstract void tyre();
	abstract void tailLight();
	void brandName() {
		System.out.println("This is brand name : ");
	}
}

class Bike extends Vehicle{

	@Override
	void tyre() {
		System.out.println("This is bike tyre");		
	}

	@Override
	void tailLight() {
		System.out.println("This is bike tailLight");				
	}
	
}


class Car extends Vehicle{

	@Override
	void tyre() {
			System.out.println("This is Car tyre");		
	}

	@Override
	void tailLight() {
		System.out.println("This is Car tailLight");		
		
	}
}