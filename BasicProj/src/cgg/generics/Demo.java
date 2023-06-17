package cgg.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//Advantage of generics Type safety-errors are caught at compile time
          ArrayList<Integer> l=new ArrayList<>();
          //l.add("hello");
          l.add(2);
          //Type is object class here
          List al=new ArrayList();
          al.add("hello");
          al.add(12);
          al.add(true);
          al.add(12.45);
          
          System.out.println(l);
          System.out.println(al);
	}

}
