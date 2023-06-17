package cgg.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		//order is not preserved in HashMap
         Map<String,Integer> courses=new HashMap<>();
         courses.put("Core Java",1000);
         courses.put("Python",3000);
         courses.put("c",5000);
         courses.put("Spring",2000);
         //new key wont added but value is override
         courses.put("c",2000);
         System.out.println(courses);
         courses.forEach((k,v)->System.out.println(k+"=>"+v));
         
         System.out.println("-----------------------------");
         
         //Traversing Map using iterator
         Set ks=courses.entrySet();
         Iterator it = ks.iterator();
         while(it.hasNext()) {
        	  Map.Entry me= (Map.Entry)it.next();
        	  System.out.println(me.getKey()+"--> "+me.getValue());
         }
         int fees=courses.get("Core Java");
         int newFees=fees+1000;
         //Updating a value
         courses.put("Core Java",newFees);
         System.out.println(courses.get("Core Java"));
         System.out.println("---------------------------");
         System.out.println("After UpDating");
         courses.forEach((k,v)->System.out.println(k+"-->"+v));
         System.out.println("-----------------------------");
         //order is preserved in LinkedHashMap
         Map<String,Integer> lc=new LinkedHashMap<>();
         lc.put("Core Java",1000);
         lc.put("Python",3000);
         lc.put("c",5000);
         lc.put("Spring",2000);
         System.out.println(lc);
	}

}
