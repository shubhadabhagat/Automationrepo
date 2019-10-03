package functionsprac;

public class User1busprac {

	public static void main(String[] args) {
		Bus shivneri=new Bus();
		shivneri.wheels=4;
		shivneri.colour="white";
		shivneri.seater=24;
		shivneri.acceleration();
		
		Bus bus2=new Bus();
		bus2.wheels=4;
		bus2.colour="Yellow";
		bus2.seater=50;
		bus2.acceleration();
		
		System.out.println(shivneri.colour);
		System.out.println(bus2.seater);
	
		
	}

}
