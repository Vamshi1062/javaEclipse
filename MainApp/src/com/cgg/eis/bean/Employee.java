package com.cgg.eis.bean;

public class Employee {

	    public String id;
	    public String name;
	    public double salary;
	    public String designation;
	    public String insuranceScheme;
	    public Employee() {
	    	super();
	    }
	    public Employee(String id, String name, double salary, String designation) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.designation = designation;
			 
		}
	     
	    public String getId() {
			return id;
		}
 
 		public void setId(String id) {
			this.id = id;
		}
 
		public String getName() {
			return name;
		}
 
		public void setName(String name) {
			this.name = name;
		}
 
		public double getSalary() {
			return salary;
		}
 
		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getInsuranceScheme() {
			return insuranceScheme;
		}

		public void setInsuranceScheme(String insuranceScheme) {
			this.insuranceScheme = insuranceScheme;
		}


		@Override
		public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
	                + ", insuranceScheme=" + insuranceScheme + "]";
	    }
}




