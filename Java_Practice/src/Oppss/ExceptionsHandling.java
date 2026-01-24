package Oppss;

public class ExceptionsHandling {
	public static void main(String[] args) {
		int a[]= new int[5];
		System.out.println("Hello Guys");
	
//	try {
//		System.out.println(a[8]);
//		int result =5/8;
//	}catch(ArrayIndexOutOfBoundsException |ArithmeticException ab) {
//		System.out.println("Out of bound ");
//		System.err.println(ab.getStackTrace());
//		System.err.println(ab.getMessage());
//		System.err.println(ab);	
//	}finally {
//		System.out.println("this is finally");
//	}
//	System.out.println("End programme");
		try {
			getNumberFromArray(a);
		} catch (Exception e) {
			System.out.println("this is error " + e.getMessage());
		}
	}

	 static int getNumberFromArray(int[] a)throws ArithmeticException {
		 		return a[8];		
	}
	 
}