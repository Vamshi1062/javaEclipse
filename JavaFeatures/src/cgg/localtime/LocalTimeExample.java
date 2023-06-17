package cgg.localtime;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		 LocalTime time = LocalTime.now();
		 System.out.println("Time :"+time);
		 LocalTime of = LocalTime.of(7,33, 30, 123456);
		 System.out.println(of);
		 System.out.println("Hour :"+time.getHour());
		 System.out.println("Minus 2 hours from now "+time.minusHours(2));
		 System.out.println("plus one hour from now "+time.plusHours(1));
		 System.out.println(time.withHour(2));
		 
		 System.out.println(time.isAfter(of));
	}

}
