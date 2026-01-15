package Oppss;

public class Constructors {

	public static void main(String[] args) {

		Complex c = new Complex(2, "Rupesh");
		Complex c1 = new Complex(4, "suraj");
		c.print();
		c1.print();
	}

}
class Complex{
	
	int a;
	String b;
	 
	public Complex(int real,String imaginary) {
		a=real;
		b=imaginary;
	}
	void print() {
		System.out.println(a + " " +b);
	}
	
}