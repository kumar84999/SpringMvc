package com.ciq.service;

import java.util.List;

import com.ciq.Student;

public interface StudentService {
	void save(Student student);
	List<Student> getStudents();
	void delete(int id);
	void update(Student student);
	Student getbyid(int id);
	

}
