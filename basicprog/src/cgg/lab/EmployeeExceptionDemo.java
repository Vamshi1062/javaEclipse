package cgg.lab;

import java.util.Scanner;

class EmployeeException extends Exception {
private int salary;

	public EmployeeException(int salary) {
	super();
	this.salary = salary;
}

	@Override
	public String toString() {
		return salary +" is  low salary";
	}
}
class Emp1{
	int age;
	String name;
	int salary;
	
	public void getDetails() throws EmployeeException{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter name");
	 name=scan.next();
	 System.out.println("Enter age");
	 age=scan.nextInt();
	 System.out.println("Enter salary");
	 salary=scan.nextInt();
	 
	 if(salary<3000) {
		 throw new EmployeeException(salary);
	 }
	}
}
public class EmployeeExceptionDemo{
	public static void main(String[] args) {
		Emp1 emp= new Emp1();
		try {
			emp.getDetails();
		} catch(EmployeeException e) {
			System.out.println(e);
		}

	}

}

