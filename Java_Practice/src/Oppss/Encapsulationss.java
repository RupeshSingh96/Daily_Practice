 package Oppss;

public class Encapsulationss {

	public static int count=12; //for static keyword
	public static void hello() {
		System.out.println("hello");
	}
	public void hi() {
		System.err.println("hi");
		hello();
	}
	private int age;
	private String name;
	
	boolean canBeChanged=true;
	boolean giveAccess=false;
	
	public void setAge(int age) {
		if (canBeChanged) {
			this.age = age;
		}
	}

	public int getage() {
		if (giveAccess) {
			return age;
		} else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Encapsulationss ec= new Encapsulationss();
		ec.setAge(12);
		
		System.err.println(ec.getage());
	}
	
}
