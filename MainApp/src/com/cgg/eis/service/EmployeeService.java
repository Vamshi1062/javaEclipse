package com.cgg.eis.service;
import com.cgg.eis.bean.Employee;
import com.cgg.eis.exception.EmployeeException;

public interface EmployeeService {
    void viewEmployeesByInsuranceScheme(String insuranceScheme);
	void addEmployee();
	void deleteEmployee(String employeeId);
	String findInsuranceScheme(double salary, String designation);
}

