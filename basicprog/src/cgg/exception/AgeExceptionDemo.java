package cgg.exception;

import java.util.Scanner;

class AgeException extends Exception {
private int age;

	public AgeException(int age) {
	super();
	this.age = age;
}

	@Override
	public String toString() {
		return age+" is invalid age ";
	}
}
class Emp{
	int age;
	String name;
	
	public void getDetails() throws AgeException{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter name");
	 name=scan.next();
	 System.out.println("Enter age");
	 age=scan.nextInt();
	 
	 if(age<16) {
		 throw new AgeException(age);
	 }
	}
}
public class AgeExceptionDemo{
	public static void main(String[] args) {
		Emp emp= new Emp();
		try {
			emp.getDetails();
		} catch(AgeException e) {
			System.out.println(e);
		}

	}

}
