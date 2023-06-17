package cgg.lab;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
      ArrayList<String> p=new ArrayList<>();
      p.add("Banana");
      p.add("Apple");
      p.add("Papaya");
      p.add("Mango");
      
      Collections.sort(p,new NComparator());
      for(String s:p) {
    	  System.out.println(s);
      }
	}

}
