package Oppss;

public class ClassAndObj {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.Name="Tommy";
		d.age=5;
		d.dogbreed();
		
		Dog d1 = new Dog();
		d1.Name="Lofi";
		d1.age=6;
		d1.dogSound();

		Cat c = new Cat();
	    c.Name = "Kitty";
	    c.age = 3;
	    c.catSound();
	        
	    Cat c1 = new Cat();
		c.Name = "pitu";
		c1.age = 5;
		c1.catbreed();
	}
}
class Dog{
	String Name;
	int age;
	String colour; 
	String breed;
	
	void dogSound (){
		System.out.println("This is Dog name :" + Name);
	}
	void dogbreed (){
		System.out.println("This is Dog age :" + age);
	}
}

class Cat{
	String Name;
	int age;
	
	void catSound (){
		System.out.println("This is cat name :" + Name);
	}
	void catbreed (){
		System.out.println("This is cat age :" + age );
	}
}