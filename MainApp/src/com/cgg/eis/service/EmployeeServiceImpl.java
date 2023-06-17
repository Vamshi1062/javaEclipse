package com.cgg.eis.service;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cgg.eis.bean.Employee;

public abstract  class EmployeeServiceImpl implements EmployeeService{
	private Map<String, Employee> employeeMap;

    public EmployeeServiceImpl() {
        employeeMap = new HashMap<>();
    }
	
	@Override
	public String findInsuranceScheme(double salary,String designation) {
		String scheme="";
    	if(designation.equals("System Associate")&&(salary>5000&& salary<20000)) {
    		scheme="Scheme C";
    	}
    	else if(designation.equals("Programmer")&&(salary>=20000&& salary<40000)) {
    		scheme="Scheme B";
    	}
    	else if(designation.equals("Manager")&&(salary>=40000&&salary<20000)) {
    		scheme="Scheme A";
    	}
    	else if(designation.equals("Clerk")&&(salary<5000)){
    		scheme="No Scheme";
    	}
         
        return scheme; 
	}
	
	public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        System.out.println("Employee details added successfully.");
    }
	public void viewEmployeesByInsuranceScheme(String insuranceScheme) {
        boolean found = false;
        for (Employee employee : employeeMap.values()) {
            if (employee.getInsuranceScheme().equalsIgnoreCase(insuranceScheme)) {
                System.out.println("Employee Details:");
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
                System.out.println("---------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with the given insurance scheme.");
        }
    }
	public void deleteEmployee(String employeeId) {
        Employee removedEmployee = employeeMap.remove(employeeId);
        if (removedEmployee != null) {
            System.out.println("Employee with ID " + employeeId + " deleted successfully.");
        } else {
            System.out.println("No employee found with the given ID.");
        }
    }
 
}
