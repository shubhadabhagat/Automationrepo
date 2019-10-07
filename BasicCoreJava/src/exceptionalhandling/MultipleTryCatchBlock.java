package exceptionalhandling;

import functions.AccessModifiers;

public class MultipleTryCatchBlock {
	static AccessModifiers acc;
	public static void main(String[] args) {
		try {
			String[] str = new String[3];
			str[0] = "Shubhada";
			str[1] = "Bhagat";
			str[2] = "Techbodhi";

			// ArrayIndexOutOfBoundsException-1st exception
			System.out.println(str[2]);

			// ArithmeticException-2nd exception
			System.out.println(10/1);

			// NullPointerException-3rd exception
			//acc.publicFunction();

			String add = "Shubhada";
			// StringIndexOutOfBoundsException-4th exception
			System.out.println(add.charAt(4));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}finally
		{
			System.out.println("Finally Block");
			System.out.println("Closing of Database Connection");
			System.out.println("End Report");
			System.out.println("Clear Cache");
		}
	}

}
