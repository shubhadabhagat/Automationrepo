package loops;

public class ForLoop2 {

	public static void main(String[] args) {
		
		for(int calltoHusband=1;calltoHusband<=5;calltoHusband++) {
			if(calltoHusband==3) {
			System.out.println("Say Sorry");
			break;
			}else {
				System.out.println("Call Again");
			}
		}

	}

}
