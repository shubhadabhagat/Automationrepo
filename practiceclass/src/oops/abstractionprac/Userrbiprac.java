package oops.abstractionprac;


public class Userrbiprac {

	public static void main(String[] args) {
		RBIprac acc;
		acc=new PNBprac();
		acc.currentAccount();
		acc.savingsAccount();
	
		acc=new Canaraprac();
		acc.currentAccount();
		acc.savingsAccount();
		
		acc=new SBIprac();
		acc.currentAccount();
		acc.savingsAccount();
	}

}
