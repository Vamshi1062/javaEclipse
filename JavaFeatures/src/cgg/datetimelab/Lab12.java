package cgg.datetimelab;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter First  year");
		 int year1=scan.nextInt();
		 System.out.println("Enter First month");
		 int month1=scan.nextInt();
		 System.out.println("Enter First day");
		 int day1=scan.nextInt();
		 LocalDate start = LocalDate.of(year1,month1,day1);
		 System.out.println("Enter Second  year");
		 int year2=scan.nextInt();
		 System.out.println("Enter Second month");
		 int month2=scan.nextInt();
		 System.out.println("Enter Second day");
		 int day2=scan.nextInt();
		 LocalDate end = LocalDate.of(year2,month2,day2);
		 
		 Period period = start.until(end);
		 System.out.println("Days "+period.get(ChronoUnit.DAYS));
         System.out.println("Months "+period.get(ChronoUnit.MONTHS));
         System.out.println("Years "+period.get(ChronoUnit.YEARS));
	}

}