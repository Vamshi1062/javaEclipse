package cgg.datetimelab;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab15 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter date of birth as YYYY-MM-DD");
		 String dob=s.next();
		 LocalDate dateofb=LocalDate.parse(dob);
		 Period age=calAge(dateofb);
		 System.out.println("Your Age is "+age);		 

	}

	private static Period calAge(LocalDate dob) {
		 LocalDate now = LocalDate.now();
		 Period between = Period.between(now, dob);
		return between;
	}

}
