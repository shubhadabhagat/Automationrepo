package exceptionalhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionType2 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		System.out.println("Testing");
		
		Thread.sleep(2000);//Using throws declaration
		
		System.out.println("Testing2");

		FileInputStream file=new FileInputStream("");
		
	}

}
