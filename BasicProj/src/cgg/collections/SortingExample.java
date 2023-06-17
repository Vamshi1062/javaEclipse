package cgg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {

	public static void main(String[] args) {
  
		ArrayList<Emp> emps=new ArrayList<>();
		emps.add(new Emp("pqr","123456",3));
		emps.add(new Emp("xyz","654321",2));
		emps.add(new Emp("abc","678901",6));
		
		System.out.println(emps);
		Collections.sort(emps,new IdComparator());
		//comparator
		System.out.println(emps);
		ArrayList<Emp> emps1=new ArrayList<>(emps);
		Collections.sort(emps1,new NameComparator());
		System.out.println(emps1);
	}

}
