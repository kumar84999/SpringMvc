package com.ciq.client;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Student;
import com.ciq.service.StudentServiceImpl;

public class StudClient {
	
	public static Logger l=LoggerFactory.getLogger(StudClient.class);
	{
		l.info("controller invoked{}");
	}
	public static void main(String[] args) {
//		List<Student> s=new ArrayList<>();
//		s.add(new Student("kumar","hyd"));
//		s.add(new Student("Sriman", "pdpl"));
//		s.add(new Student("shaan", "hzbd"));
//		s.add(new Student("mahesh", "amplr"));
//		s.add(new Student("kumm", "mncl"));
//		
// Student s=new Student(1, "raju", "hyd");
		
		
	
	ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
	StudentServiceImpl se = co.getBean(StudentServiceImpl.class);
	System.out.println(se.findbyid());
	
		
}
}
