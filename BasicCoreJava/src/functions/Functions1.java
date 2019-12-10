package functions;

public class Functions1 {

	public static void main(String[] args) {
		/*
		 * sum(10,20); sum(456,481); sum(589,928);
		 */
		int add = sum1(10, 20);
		 System.out.println(add); 
		int add2 = sum1(10, 20, 30);
		 System.out.println(add2); 
	}

	// Type1
	// access modifier,nature of method,return type of method,method or function
	// name,Argument or parameters
	
	  public static void sum(int a, int b) { int add = a + b;
	  System.out.println(add); }
	 
	// Type2
	public static int sum1(int a, int b) {
		return a + b;
	}

	// Type3--Method overloading(Same functions with different arguments
	public static int sum1(int a, int b, int c) {
		return a + b + c;
	}

}
