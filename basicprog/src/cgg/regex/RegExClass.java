package cgg.regex;

import java.util.regex.Pattern;

public class RegExClass {

	public static void main(String[] args) {
		String in="Test";
		String out="Test";
		
		boolean match=Pattern.matches(in, out);
		System.out.println(match);
	}

}
