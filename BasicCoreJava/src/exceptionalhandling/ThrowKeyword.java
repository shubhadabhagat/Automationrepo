package exceptionalhandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		System.out.println();
        divide(10,0);
	}
	public static int divide(int dividend,int divisor) throws Exception {
		int ret=0;
		if(divisor>0) {
			ret=dividend/divisor;
		
		}else {
		throw new Exception("divisor is zero");	
		}
		return ret;
	}

}
