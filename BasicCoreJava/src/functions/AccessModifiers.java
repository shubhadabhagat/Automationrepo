package functions;

public class AccessModifiers {
   public static void main(String[] args) {
	   AccessModifiers obj=new AccessModifiers();
	   
	   obj.publicFunction();
	   obj.privateFunction();
	   obj.noAccessModFunction();
	   obj.protectedFunction();
}
	public void publicFunction() {
     System.out.println("Public Function");
	}

	private void privateFunction() {
System.out.println("Private Function");
	}

	void noAccessModFunction() {
System.out.println("No Access Modifier");
	}

	protected void protectedFunction() {
System.out.println("Protected Class");
	}

}
