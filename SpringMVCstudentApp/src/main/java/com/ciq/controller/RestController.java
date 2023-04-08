//package com.ciq.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.ciq.pojo.Student;
//import com.ciq.service.StudentServiceimpl;
//
//@Controller
//public class RestController {
//
//	@Autowired
//	private StudentServiceimpl serviceimpl;
//
//	@ResponseBody
//	@GetMapping("/rest")
//	public String loginpage() {
//		return "restcontroller";
//
//	}
//
//	@ResponseBody
//	@GetMapping("/Rgetall")
//	public List<Student> getAll() {
//		return serviceimpl.getAllstudends();
//
//	}
//
//	@ResponseBody
//	@GetMapping("/byid/{id}")
//	public Student getbyid(@PathVariable int id) {
//		return serviceimpl.getbyid(id);
//
//	}
//
//	@ResponseBody
//	@PostMapping("/saved")
//	public void insert(@RequestBody Student student) {
//		serviceimpl.save(student);
//
//	}
//
//	@ResponseBody
//	@GetMapping("/delt/{id}")
//	public int delete(@PathVariable int id) {
//		return serviceimpl.delete(id);
//
//	}
//
//	@ResponseBody
//	@PostMapping("/upd")
//	public int update(@RequestBody Student student) {
//		return serviceimpl.update(student);
//
//	}
//
//}
