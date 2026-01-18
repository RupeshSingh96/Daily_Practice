package Oppss;

public class DataHideingg {

	public static void main(String[] args) {
		Encapsulationss ec= new Encapsulationss();
		ec.setAge(25);
		System.err.println(ec.getage());
		
		Encapsulationss.count=200;
		
		Encapsulationss ec1= new Encapsulationss();
		System.err.println(ec1.count);
		
		System.err.println(ec1.count=500);
	}
}
