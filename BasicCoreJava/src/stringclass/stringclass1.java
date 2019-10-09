package stringclass;

public class stringclass1 {

	public static void main(String[] args) {
		String str="Shubhada";
		String str2=" Shubhada ";
		
		//1.Length() function
		System.out.println(str.length());
		
		//2.Character()function
		System.out.println(str.charAt(5));
		
		//3.Uppercase function
		System.out.println(str.toUpperCase());
		
		//4.lowercase function
		System.out.println(str.toLowerCase());
		
		//5.Trim
		System.out.println(str.trim());
		
		//6.Comparison
		System.out.println(str.equals(str2));
        //7.Ignore case
		System.out.println(str.equalsIgnoreCase(str2.trim()));
		//8.Replace
		System.out.println(str.replace("u","i"));
		//9.Split
		String[] temp=str.split("b");
		for(String s:temp)
		{
		System.out.println(s);
	}
		//10.Sub String with beginindex
		System.out.println(str.substring(2));
		//11.Substring with beginindex(this index will be counted) and endindex(last index will not be counted)
		System.out.println(str.substring(2, 7));

	}
	}


