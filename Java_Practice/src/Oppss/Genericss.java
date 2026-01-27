package Oppss;

public class Genericss {

	public static void main(String[] args) {
		Cats<String> c= new Cats<>("sdfgbs");
		Cats<Integer> c1= new Cats<>(125);
		System.out.println(c); 
		printData("Hello");
		printData('A');

	}
	 static <A> void printData(A data) {
		 System.err.println(data);
	 }
}
class Cats<E>{
	E id;
//	V name;
	
	public Cats(E id) {
		this.id=id;
//		this.name=name;
	}
}