package cgg.datetimelab;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Lab14 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter ZoneId");
		 String id=s.next();
		 
		 ZonedDateTime t= calculateZoned(id);
		 System.out.println("Time and Date of "+id+" is "+t );

	}

	private static ZonedDateTime calculateZoned(String id) {
		 ZonedDateTime now = ZonedDateTime.now(ZoneId.of(id));
		 
		return now;
	}

	 
}
