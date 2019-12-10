package functions;

public class Function1 {
	public static void main(String[] args) {
	int add=sum1(10,20);
	System.out.println(add);
	int add2=sum1(40,50,60);
System.out.println(add2);
	}
	public static void sum(int a,int b) {
		
		int add=a+b;
		System.out.println(add);
		

	}

   public static int sum1(int a,int b) {
		
		return a+b;

	}

public static int sum1(int a,int b,int c) {
	return a+b+c;
}
	

}
