package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1234,"Amit");
		map.put(2345, "Teju");
		map.put(5865, "Shubhada");
		map.put(null, "pqrst");
		System.out.println(map.get(5865));
		System.out.println(map.get(null));
		//Iterator Method for printing values with iterator
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		
		//for(Object i:map.keySet()) {
		//	System.out.println(map.get(i));
		//}

	}

}
