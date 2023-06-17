package cgg.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
      Hashtable<String,Double> balance=new Hashtable<>();
      balance.put( "vamshi",123.45);
      balance.put( "shiva",543.45);
      balance.put( "sanju",563.45);
      
      System.out.println(balance);
      Enumeration<String> names;
      String s;
      names=balance.keys();
      while(names.hasMoreElements()) {
    	  s=(String)names.nextElement();
    	  System.out.println(s+"-->"+balance.get(s));
      }
      double val=balance.get( "vamshi");
      double newVal=val+200;
      balance.put("vamshi",newVal);
      //updating value
      System.out.println("-------------------------------");
      System.out.println(balance.get("vamshi"));
      System.out.println("-------------------------------");
      System.out.println("For Each Method...");
      balance.forEach((k,v)->System.out.println(k+"-->"+v));
	}

}
