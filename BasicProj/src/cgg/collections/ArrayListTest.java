package cgg.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListTest {
  public static void main(String[ ]args) {
	  // //type safe
	  List<String> list=new ArrayList<>();
	  list.add("hi");
	  String str="hello";
	  list.add(str);
	  list.add(str+str);
	  list.add("1");
	  System.out.println(list.get(0));
	  System.out.println(list);
	  System.out.println(list.contains("42"));
	  System.out.println(list.contains("hellohello"));
	  System.out.println(list.size());
	  System.out.println(list.remove( "hello"));
	  System.out.println(list.size());
	  
	  //check for empty
	  System.out.println(list.isEmpty());
	  
	  //setting value
	  list.set(1,"sss");
	  System.out.println(list);
	  
	  //adding at specified position
	  list.add(2,"aaa");
	  System.out.println(list);
	  
	  //remove all elements
//	  list.clear();
//	  System.out.println(list);
	  
	  //type unsafe
//	  LinkedList ll=new LinkedList();
//	  ll.add("abc");
//	  ll.add(24.567);
//	  ll.add(12);
//	  ll.add(true);
//	  System.out.println(ll);
	  
	  List<String> vector=new Vector<>();
	  vector.addAll(list);
	  System.out.println("Vector : "+vector);
	  
	  HashSet<Double> hs=new HashSet<>();
	  hs.add(14.34);
	  hs.add(34.76);
	  hs.add(new Double(67.56));
	  //duplicates not allowed in set
	  hs.add(14.34);
	  System.out.println("HashSet : "+hs);
	  
	  
	  Set<Double> ts=new TreeSet<>();
	  ts.addAll(hs);
	  System.out.println("TreeSet : "+ts);
	  
	  Set<Double> lhs=new LinkedHashSet<>();
	  lhs.addAll(ts);
	  System.out.println("LinkedHashset : "+lhs);
  }
}
