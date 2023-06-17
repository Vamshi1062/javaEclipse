package cgg.collections;

import java.util.TreeSet;

public class TreeSetSortExample {

	public static void main(String[] args) {
		 TreeSet<Emp> set=new TreeSet<>();
        set.add(new Emp("pqr","123456",3));
 		set.add(new Emp("xyz","654321",2));
 		set.add(new Emp("abc","678901",6));
 		set.add(new Emp("uvw","546363",1));
 		System.out.println(set);
 		//only comparable will work
	}

}
