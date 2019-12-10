package functions;

public class User {

	public static void main(String[] args) {
		Car polo=new Car();
		polo.wheels=4;
		polo.colour="Green";
		polo.type="Hatchback";
		polo.acceleration();
		Car HondaCity=new Car();
		HondaCity.wheels=4;
		HondaCity.colour="White";
		HondaCity.type="Sedan";
		HondaCity.acceleration();
		Car amaze=new Car();
		amaze.wheels=4;
		amaze.colour="Red";
		amaze.type="Hatchback";
		amaze.acceleration();
		Car car3=new Car();
		
		System.out.println(polo.wheels);
		System.out.println(HondaCity.wheels);
		System.out.println(amaze.wheels);
		System.out.println(car3.wheels);
		
		System.out.println(polo.colour);
		System.out.println(HondaCity.colour);
		System.out.println(amaze.colour);
		System.out.println(car3.colour);
	}

}
