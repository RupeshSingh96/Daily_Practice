package Oppss;

public class ChildInheritance extends ParentInheritance{
String name= "rupesh";
	
	void childInherit() {
		System.out.println(this);
		System.out.println(this.name);
		System.out.println("This is child inheritance");
	}
	void inherit() {
		System.out.println("This is child inherit() in child class");
	}
	
	public static void main(String[] args) {
		
		
		ChildInheritance child = new ChildInheritance();
		child.name="Rupesh";
		child.propertyType="Flat";
		child.count=4;
		child.Type="chawl";
		child.inherit();
		child.childInherit();
	}
}
