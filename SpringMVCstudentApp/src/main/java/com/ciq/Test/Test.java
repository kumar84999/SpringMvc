package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.pojo.Student;
import com.ciq.service.StudentServiceimpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("springmvc.xml");
		StudentServiceimpl bean = c.getBean(StudentServiceimpl.class);
//		Student s = new Student(01, "hh", "hr", "hyd");
//		bean.save(s);
		System.out.println("sucess");
		System.out.println(bean.getAllstudends());

	}

}
