package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.StudentDaoImpl;
import com.ciq.pojo.Student;
@Service
public class StudentServiceimpl implements StudentService{
	
	@Autowired
	private StudentDaoImpl Serviceimpl;

	@Override
	public void save(Student student) {
		Serviceimpl.save(student);
		
		
	}

	@Override
	public int update(Student student) {
		
		return Serviceimpl.update(student);
	}

	@Override
	public int delete(int id) {
	
		return Serviceimpl.delete(id);
	}

	@Override
	public List<Student> getAllstudends() {
		
		return Serviceimpl.getAllStudent();
	}

	@Override
	public Student getbyid(int id) {
		
		return Serviceimpl.getbyid(id);
	}

}
