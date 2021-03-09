package com.ujjwal.employment.dto;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

// employee properties defined in this class
@Entity
//@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //internally generated....
	private int empid;
	//@Column(name="emp_name", length=255, nullable=false, unique=false)
	private String empname;
	//@Column(name="deptname", length=255, nullable=false, unique=false)
	private String deptname;
	
	//adding default constructors..
	public Employee() {
	}
	
	//adding constructors...
	public Employee(int empID, String empName, String deptname) {
		super();
		this.empid = empID;
		this.empname = empName;
		this.deptname = deptname;
	}
	
	//getters and setters...
	public int getEmpID() {
		return empid;
	}
	public void setEmpID(int empID) {
		this.empid = empID;
	}
	public String getEmpName() {
		return empname;
	}
	public void setEmpName(String empName) {
		this.empname = empName;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

}
