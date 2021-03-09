package com.ujjwal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ujjwal.employment.dto.Employee;
import com.ujjwal.service.InterfaceEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
    InterfaceEmployeeService empRef;
	
	@RequestMapping("/welcome")
	public String welcomeEmployee() {
		return "Hello Employee!!";
	}
	
	
	//mapping of list employees on call of employees
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee(){
		return empRef.getAllEmployee();
		
	}
	
	//method to get the employee details using empID
	@RequestMapping("/employees/{empID}")
	public Employee getEmployeByID(@PathVariable int empID) {
		return empRef.getEmployeeByID(empID);
	}

	
	//adding the employee...
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee emp) {
		empRef.addEmployee(emp);
	}
	
	//updating the employee...
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{empID}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable int empID) {
		empRef.updateEmployee(emp,empID);
	}
	
	//deleting the employee...
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{empID}")
	public void deleteEmployee(@PathVariable int empID) {
		empRef.deleteEmployee(empID);
	}
	
	//extracting user with same dept.
	@RequestMapping("/employees/dept/{deptName}")
	public List<Employee> getEmployeeByDept(@PathVariable String deptName) {
		return empRef.getEmployeeByDept(deptName);
	}
}
