package arrays;

public class Array1 {

	public static void main(String[] args) {
		String[] str=new String[5];
		str[0]="Shubhada";
		str[1]="Tejashree";
		str[2]="Maya";
		str[3]="Purva";
		str[4]="sachin";
		/*
		 * for(int i=0;i<5;i++) { System.out.println(str[i]); }
		 */
		for(String s:str) {
			System.out.println(s);
		}

	}

}
