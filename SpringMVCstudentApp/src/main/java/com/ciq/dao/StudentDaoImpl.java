package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplat;

	@Override
	public void save(Student student) {
		String insert = "insert into Student values(?,?,?,?)";
		Object[] per = { student.getId(), student.getName(), student.getdob(), student.getCity() };
		int i = jdbcTemplat.update(insert, per);
		System.out.println(i + "inserted sucessfully");

	}

	@Override
	public int update(Student student) {
		String update = "update student set name=?,dob=?,city=? where id=?";
		Object[] ep = { student.getName(), student.getdob(), student.getCity(), student.getId() };
		int result = jdbcTemplat.update(update, ep);
		System.out.println(result);
		return result;
	}

	@Override
	public int delete(int id) {
		String delete = "delete from student where id=? ";
		Object[] d = { id };
		int d1 = jdbcTemplat.update(delete, d);
		System.out.println(d1);
		return d1;
	}

//	@Override
//	public List<Student> getAllStudent() {
//		List<Student> list = jdbcTemplat.query("select*from student", (RowMapper<Student>) (rs, rowNum) -> {
//			Student s = new Student();
//			s.setId(rs.getInt(1));
//			s.setName(rs.getString(2));
//			s.setdob(rs.getString(3));
//			s.setCity(rs.getString(4));
//
//			return s;
//
//		});
//		return list;
//	}
	@Override
	public List<Student> getAllStudent() {
		List<Student> list = jdbcTemplat.query("select*from student", new BeanPropertyRowMapper<Student>(Student.class));
		return list;
	}

	@Override
	public Student getbyid(int id) {

		return jdbcTemplat.queryForObject("select*from Student where id=?", new BeanPropertyRowMapper<>(Student.class),
				new Object[] { id });
	}

}
