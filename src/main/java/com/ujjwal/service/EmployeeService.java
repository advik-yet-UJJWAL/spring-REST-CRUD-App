package com.ujjwal.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujjwal.employment.dataAccess.InEmployeeDataAccess;
import com.ujjwal.employment.dto.Employee;

@Service
public class EmployeeService implements InterfaceEmployeeService {

	
	
	List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1,"UJJWAL","SDE"),
			  new Employee(2,"RAM","HR"),
			  new Employee(3,"LALBIHARI","INTERN")));

	
	
	//creating the reference of data access layer
	@Autowired
	private InEmployeeDataAccess empDARef;
	
	@Override
	public List<Employee> getAllEmployee(){
		return empDARef.findAll();
		
	}
	
	
	
	
	
	//<---------------------------------------------------------------------------------->
	//this method return the list of all employees in the database based upon the 
	// call of the service layer from the main employee Controller class.
	/*
	@Override
	public List<Employee> getAllEmployee() {
		return empList;
	} */
	
	@Override
	public Employee getEmployeeByID(int empID) {
		//return empList.stream().filter(e -> e.getEmpID() == empID).findFirst().get();  //lambda function used here...
	
		return empDARef.getOne(empID);
	}

	@Override
	//add exception
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//empList.add(emp);
		empDARef.save(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp, int empID) {
		// TODO Auto-generated method stub
//		for(int i=0;i<empList.size();i++)
//		{
//			Employee e = empList.get(i);
//			
//			if(e.getEmpID() == empID)
//			{
//				empList.set(i, emp);
//				return;
//			}
//		}
		
		empDARef.save(emp);
	}

	@Override
	public void deleteEmployee(int empID) {
		// TODO Auto-generated method stub
		//empList.removeIf(e -> e.getEmpID() == empID);
		empDARef.deleteById(empID);
		
	}


	@Override
	public List<Employee> getEmployeeByDept(String deptName) {
		// TODO Auto-generated method stub
		return empDARef.findByDeptName(deptName);
	}
}
