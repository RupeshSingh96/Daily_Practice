package Oppss;

public class Access_modifiers {

	private int id;
	public String name;
	
	 public static void main(String[] args) {
		 int i=0;
		 int n=20;
		 
		 for(i=0;i<=n;i++) {
			  i=i+2;
		 }
		 System.err.println(i);

		Access_modifiers am = new Access_modifiers();
		am.id=1;
		am.name="Rupesh";
	}
	
}
