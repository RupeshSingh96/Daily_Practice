package Oppss;

public class MethodOverloading {

	public static void main(String[] args) {
		Greet g= new Greet();
		g.greetings();
		g.greetings("black", 30);
		g.greetings("Rupesh","black", 30);

	}
}
	
	class Greet{
		void greetings() {
			for(int i=0;i<=5;i++) {
				System.out.println("Hello , Good Morning");

			}
			
		}
		void greetings(String name) {
			System.out.println("Hello ," + name + " Good Morning");
		}
		void greetings(String Colur,int age) {
			System.out.println("Hello ," + Colur+age  + " Good Morning");
		}
		void greetings(String name,String Colur,int age) {
			System.out.println("Hello ," + name+Colur+age  + " Good Morning");
		}
		
	}

