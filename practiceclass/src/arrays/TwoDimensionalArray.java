package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String[][] str=new String[4][2];
		str[0][0]="Username";
		str[0][1]="Password";
		str[1][0]="Username1";
		str[1][1]="password1";
		str[2][0]="Username2";
		str[2][1]="Password2";
		str[3][0]="Username3";
		str[3][1]="Username3";
		for(int r=0;r<str.length;r++) {
			for(int c=0;c<str[r].length;c++) {
				System.out.println(str[r][c]);
			}
		}
		

	}

}
