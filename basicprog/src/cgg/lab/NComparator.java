package cgg.lab;

import java.util.Comparator;


public class NComparator implements Comparator<String> {
	public int compare(String name1,String name2) {
		return name2.compareTo(name1);
	}
 
}
