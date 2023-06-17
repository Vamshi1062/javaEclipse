package cgg.lab;


public class Persons {
	public enum Gender{
		M,
		F
	}
      private String fname;
	  private String lname;
	  private Object gender;
	  private int phone;
	  private Gender gender1;
  
	public Persons(String fname,String lname,char gender,int phone,Gender gender1) {
    	  this.fname=fname;
    	  this.lname=lname;
    	  this.gender=gender;
    	  this.phone=phone;
    	  this.gender1=gender1;
      }

	public String getFname() {
		return fname;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Object getGender() {
		return gender;
	}

	public Gender getGender1() {
		return gender1;
	}

	public void setGender1(Gender gender1) {
		this.gender1 = gender1;
	}

	public void setGender(Object gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		Persons details=new Persons("Vamshi","Botla",'M',1234567890,Gender.M);
		System.out.println("Person Details: ");
		System.out.println("__________________");
		System.out.println();
		System.out.println(details.getFname());
		System.out.println(details.getLname());
		System.out.println(details.getGender());
		System.out.println(details.getPhone());
		System.out.println(details.getGender1());
		
	}
}

		

