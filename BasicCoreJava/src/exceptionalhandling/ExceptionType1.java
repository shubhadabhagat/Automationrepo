package exceptionalhandling;

import functions.AccessModifiers;

public class ExceptionType1 {
static AccessModifiers acc;
	
	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "Shubhada";
		str[1] = "Bhagat";
		str[2] = "Techbodhi";

		// ArrayIndexOutOfBoundsException-1st exception
		// System.out.println(str[3]);

		// ArithmeticException-2nd exception
		// System.out.println(10/0);
		
		//NullPointerException-3rd exception
		 //acc.publicFunction();
		
		String add="Shubhada";
		//StringIndexOutOfBoundsException-4th exception
		System.out.println(add.charAt(8));
		
	}

}
