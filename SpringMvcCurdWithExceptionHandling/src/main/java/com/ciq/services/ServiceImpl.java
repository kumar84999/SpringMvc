package com.ciq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Dao.EmployeeDaoimpl;
import com.ciq.model.Employee;
@Service
public class ServiceImpl implements ServiceDao{
	
	@Autowired
	private EmployeeDaoimpl daoimpl;
	@Override
	public void save(Employee employee) {
		daoimpl.save(employee);
		
	}

	@Override
	public int delete(int id) {
		
		return daoimpl.delete(id);
	}

	@Override
	public int update(Employee employee) {
		
		return daoimpl.update(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		
		return daoimpl.getEmployees();
	}

	@Override
	public Employee updategetbyid(int id) {
		
		return daoimpl.updategetbyid(id);
	}

}
