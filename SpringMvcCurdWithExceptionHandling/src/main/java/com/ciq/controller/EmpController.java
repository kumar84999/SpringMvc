package com.ciq.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Employee;
import com.ciq.services.ServiceImpl;
@Controller
public class EmpController {
	
	@Autowired
	private ServiceImpl impl;
	
	@GetMapping("/all")
	public ModelAndView getAll(Employee employee) {
		List<Employee>vp=impl.getEmployees();
		System.out.println(vp);
		return new ModelAndView("findall","map",vp);
	}
	@GetMapping("/save")
	public String save(Employee employee) {
		return "register";
		}
	@GetMapping("/insert")
	public ModelAndView saved(@Valid Employee employee,BindingResult result) {
		
	impl.save(employee);
	ModelAndView m=new ModelAndView("redirect:all");
    return m;
	}
	
	@GetMapping("/delete")
	public String delegted(@RequestParam int id) {
		impl.delete(id);
		return "redirect:all";
	}
	@GetMapping("/up")
	public ModelAndView update(@RequestParam int id) {
		Employee employee=impl.updategetbyid(id);
		return new ModelAndView("update","dp",employee);
	}
	@PostMapping("/dt")
	public String update(Employee employee) {
		int updfate =impl.update(employee);
		System.out.println("update");
		return "Redirect:all";
	}

}
