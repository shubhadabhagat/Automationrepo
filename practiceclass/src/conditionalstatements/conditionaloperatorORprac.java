package conditionalstatements;

public class conditionaloperatorORprac {

	public static void main(String[] args) {
		int pcm=35;
		int jre=45;
		int cet=20;
		if(pcm>=55) {
			if(jre>=45 || cet>=50) {
				System.out.println("You are Eligible");	
			}else {
				System.out.println("You are not Eligible");
			}
		}
			else {
				System.out.println("You are not eligible");
			
		}

	}

}
