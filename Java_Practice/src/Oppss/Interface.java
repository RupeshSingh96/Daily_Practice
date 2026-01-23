package Oppss;

public class Interface {
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.eats();
		m.sing();
		m.walk();
	} 
} 
interface Animal{	
	void drinks();
	void eats();
	default void walk() {
		System.out.println("Animals can walk on 4 legs ");
	}
}
interface Pet{
	void sing();
	
}
class Monkey implements Animal,Pet{

	@Override
	public void eats() {
		System.out.println("Monkey is eating ");		
	}

	@Override
	public void sing() {
		System.out.println("Monkey is Singing ");		
	}

	@Override
	public void drinks() {
		System.out.println("Pet is drinking ");		
	}
	
}