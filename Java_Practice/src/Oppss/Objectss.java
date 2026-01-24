package Oppss;

class Patients{
	String name;
	int age;
	
	public Patients(String name,int age) {
		this.name= name;
		this.age=25;
	}
	
	public boolean equals(Object obj) {
		Patients p=(Patients)obj;
		if(this.name == p.name && this.age==p.age) {
		return true;
		
	}
	return false;
}
	public String toString() {
		return "Patients name " +name + " patients age " +age;
	}
	
}

public class Objectss {
public static void main(String[] args) {
	Patients p1= new Patients("Sofiya", 25);
	Patients p2= new Patients("Sanket", 30);
	System.out.println(p1.equals(p2)); 
	
	
	
}
}
