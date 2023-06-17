package cgg.lab;

public class ValidateFullName {

	private String firstName;
	private String lastName;
	public ValidateFullName(String fname,String lname)
	{
	if((fname == null||fname==" " )&& (lname==null|| lname==" ")){
	throw new IllegalArgumentException("Both Names Cannot be NULL");
	}
	this.firstName=fname;
	this.lastName = lname;
	}
	public String getFullName()
	{
	String first=(this.firstName != null)? this.firstName:"?";
	String last=(this.lastName != null)? this.lastName:"?";
	return first + " " + last;
	}
	public String getFirstName(){
	return this.firstName;
	}
	public String getLastName(){
	return this.lastName;
	}


	public static void main(String[] args) {
		ValidateFullName v=new ValidateFullName(" "," ");
		System.out.println(v.getFullName());
	}

}
