package exceptionalhandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "Shubhada";
		str[1] = "Bhagat";
		str[2] = "Techbodhi";
 try {
		// ArrayIndexOutOfBoundsException-1st exception
		System.out.println(str[3]);
 }catch(ArrayIndexOutOfBoundsException e)
 {
	 System.out.println(e.getMessage());
 }
	
 try {
 // ArithmeticException-2nd exception
		System.out.println(10 / 0);
 }catch(ArithmeticException e) {
	 System.out.println(e.getMessage());
 }
 try {
		String add = "Shubhada";
		// StringIndexOutOfBoundsException-4th exception
		System.out.println(add.charAt(8));
 }catch(StringIndexOutOfBoundsException e) {
	 System.out.println(e.getMessage());
 }
		System.out.println("Testing Completed");
	}

}
