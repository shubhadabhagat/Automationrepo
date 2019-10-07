package oops.polymorphismprac;

public class Staticprac {
public static void main(String[] args) {
	int a=10;
	int b=1000;
	int c=568;
	int sum=a+b;
	System.out.println(sum);
	int sum1=a+b+c;
	System.out.println(sum1);
}
public static int sum(int a,int b) {
	return a+b;
}
public static int sum(int a,int b,int c) {
	return a+b+c;
}
}
