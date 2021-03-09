package com.ujjwal.service;

import java.util.List;


import com.ujjwal.employment.dto.Employee;

public interface InterfaceEmployeeService {

	List<Employee> getAllEmployee();
	
	Employee getEmployeeByID(int id);

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp, int empID);

	void deleteEmployee(int empID);

	List<Employee> getEmployeeByDept(String deptName);

}
