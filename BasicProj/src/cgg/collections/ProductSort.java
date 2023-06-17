package cgg.collections;


import java.util.Arrays;

public class ProductSort {
static void sort(String...s) {
	Arrays.sort(s);
	for(String i:s) 
		System.out.print(i+ "\t");
}
	public static void main(String[] args) { 
		sort("Banana","Mango","Apple","Papaya");
		}
}


