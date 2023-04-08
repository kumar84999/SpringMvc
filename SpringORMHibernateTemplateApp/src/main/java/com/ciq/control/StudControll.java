package com.ciq.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.Student;
import com.ciq.service.StudentService;
import com.ciq.service.StudentServiceImpl;

@Controller
public class StudControll {
	@Autowired
	private StudentServiceImpl impl;
	 
	@GetMapping("/all")
	 public ModelAndView getall(Student student) {
		 List<Student> geStudents = impl.getStudents();
		 System.out.println(geStudents);
		return new ModelAndView("getAll", "map", geStudents);
		 
	 }
	 
	 @GetMapping("/insert")
	 public String save(Student student) {
		return "insert" ;
	 }
	 
	 @PostMapping("/save")
	 public String saved(Student student) {
		 
		 System.out.println(student);
		 impl.save(student);
		 
		 
		return "redirect:all";
		 
	 }
	@GetMapping("/delete")
	 public String delete(@RequestParam int id)	{
		 impl.delete(id);
		return "redirect:all";
		 
	 }
	@PostMapping("/upd")
	public String update(Student student) {
		impl.update(student);
		return "redirect:all";
		
	}
	@GetMapping("/update")
	 public ModelAndView save(@RequestParam int id) {
		return new ModelAndView("update", "data", impl.getbyid(id));
	 }
	
	
	
	

}
