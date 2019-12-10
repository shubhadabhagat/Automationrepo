package conditionalStatements;

public class ConditionalStatementsOr {

	public static void main(String[] args) {
		int pcm=70;
		int cet=40;
		int jre=50; 
		if(pcm>=60) {
			if(cet>=50 || jre>=60)
			{
				System.out.println("You are eligible");
			}else {
				System.out.println("You are not eligible");
			}
		}else {
			System.out.println("You are not eligible");
		}

	}

}
