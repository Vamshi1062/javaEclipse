package cgg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx {

	public static void main(String[] args) {
		String in="ExPx1";
		Pattern p=Pattern.compile("^[A-Z][a-zA-Z]*[0-9]$");
		Matcher m=p.matcher(in);
		boolean l=m.find();
		if(!l) {
			System.out.println("Enter string which Starts with Upper case Alphabet and ends with digit");
		}
		

	}

}
