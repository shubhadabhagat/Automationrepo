package loops;

public class ForLoop2 {

	public static void main(String[] args) 
	{
		for(int calltoHusband=1; calltoHusband<=10; calltoHusband++)
		{
			if(calltoHusband==3)
			{
				System.out.println("Will have to say sorry");
				break;
			}
			System.out.println("Call again");
		}

	}

}
