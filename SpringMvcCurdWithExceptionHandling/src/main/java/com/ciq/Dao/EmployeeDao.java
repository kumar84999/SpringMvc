package com.ciq.Dao;

import java.util.List;

import com.ciq.model.Employee;

public interface EmployeeDao {
	void save(Employee employee);
	int delete(int id);
	int update(Employee employee);
	List<Employee>getEmployees();
	Employee updategetbyid(int id);	
	

}
