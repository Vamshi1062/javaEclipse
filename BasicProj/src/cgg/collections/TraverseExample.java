package cgg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {
    ArrayList<String> l=new ArrayList<>();
    l.add("Farooq");
    l.add("ajay");
    l.add("sanju");
    l.add("raj");
    //Method 1
    for(String s:l) {
    	System.out.print(s+ "\t"+s.length()+"\t");
    	StringBuffer buffer = new StringBuffer(s);
    	System.out.println(buffer.reverse());
    }
    System.out.println("--------------------------");
    //Method 2-->only forward
    Iterator<String> it=l.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    System.out.println("--------------------------");
    //method 3-->backward and forward
    ListIterator<String> lit=l.listIterator(l.size());
    while(lit.hasPrevious()) {
    	System.out.println(lit.previous());
    }
    System.out.println("---------------------------");
    //Method 4-->forEach()
    l.forEach(e->System.out.println(e));
    System.out.println("---------------------------");
    System.out.println("Sorting Of Elements");
    TreeSet<String> ts=new TreeSet<>();
    ts.addAll(l);
    ts.forEach(e->System.out.println(e));
	}
}
