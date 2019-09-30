package functions;

public class User1 {
public static void main(String[] args) {
	Car polo=new Car();
	polo.wheels=4;
	polo.colour="Maroon";
	polo.type="Hatchback";
	polo.acceleration();
	
	Car car2=new Car();
	car2.wheels=6;
	car2.colour="Silver";
	//car2.type="Sedan";
	car2.acceleration();
	
	Car car3=new Car();
	
	System.out.println(polo.colour);
	System.out.println(car2.colour);
	System.out.println(car3.colour);
	
	System.out.println(polo.wheels);
	System.out.println(car2.wheels);
	System.out.println(car3.wheels);
	
}

}
