package com.ciq.services;

import java.util.List;

import com.ciq.Employee;

public interface ServiceDao {
	void save (Employee employee);
	int delete(int id);
	int update(Employee employee);
	List<Employee>getEmployee();
	Employee updategetbyid(int id);
	

}