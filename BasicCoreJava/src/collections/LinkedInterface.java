package collections;

import java.util.ArrayList;
import java.util.List;

public class LinkedInterface {

	public static void main(String[] args) {
		List list=new ArrayList();
        list.add("Shubhada");
        list.add(30);
        list.add(true);
//        Object[] obj=new Object[3];
//        obj[0]="Shubhada";
//        obj[1]=30;
//        obj[2]=true;
        
        for(Object o:list)
        {
        	System.out.println(o);
        }
	}

}
