package com.ciq.studentDao;

import java.util.List;

import com.ciq.Student;

public interface StudentDao {
void save(Student student);
List<Student>getStudent();
void update(Student student);
void delete(int id);
 Student updategetbyid(int id);
}
