package cgg.lab;
import java.util.*;

public class Person {
	public static void main(String[] args) {
		Scanner FirstName=new Scanner(System.in);
		System.out.println("Enter First Name");
		String FName = FirstName.nextLine(); 
	    
		Scanner LastName=new Scanner(System.in);
		System.out.println("Enter Last Name");
		String LName = LastName.nextLine(); 
	    
		Scanner Gender=new Scanner(System.in);
		System.out.println("Enter Gender");
		String Gen = Gender.nextLine(); 
	   
		Scanner Age=new Scanner(System.in);
		System.out.println("Enter Age");
		String age = Age.nextLine(); 
	    Scanner Weight=new Scanner(System.in);
		System.out.println("Enter Weight");
		String wt = Weight.nextLine(); 
	    
	    
	    System.out.println("Person Details :");
	    System.out.println("_____________________");
	    System.out.println();
	    System.out.println("Firstname : " + FName);
	    System.out.println("Firstname : " + LName);
	    System.out.println("Gender : " + Gen);
	    System.out.println("Age: " + age);
	    System.out.println("Weight: " + wt);

	    
		
	}

}
