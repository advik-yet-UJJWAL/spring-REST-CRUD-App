package com.ujjwal.employment.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ujjwal.employment.dto.Employee;

// CRUD implementation done in this interface after extending from JPARepository
@Repository 
public interface InEmployeeDataAccess extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByDeptName(String deptName);

}
