package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface2 {

	public static void main(String[] args) {
		List<String> list;
		
		  // ArrayList list = new ArrayList<>();
		///list.add("Shubhada");
		 // list.add("Pradeep"); 
		//  list.add("Mahesh"); 
		 // list.add("Pradeep"); 
		  //for (String s : list)
		  //{ 
			//  System.out.println(s);
			//  }
		 
		list = new LinkedList<>();
		list.add("Shubhada");
		list.add("Pradeep");
		list.add("Mahesh");
		list.add("Pradeep");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
