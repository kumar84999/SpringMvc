package com.ciq.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Control{
	@RequestMapping(value = "/login" ,method = RequestMethod.GET)
	public ModelAndView login(@RequestParam("userName")String userName, @RequestParam("password")String password){

		String message ="hello";
		if (userName != null && !userName.equals("") && userName.equals("kumar") && password != null
				&& !password.equals("") && password.equals("123")) {
			message = "Welcome " + userName + ".";
			return new ModelAndView("welcome", "message", message);
			
		}else {
			message="your enter wrong details ";
			return new ModelAndView("error","message",message);
		}
		
//		return new  ModelAndView("welcome", "message", "hiii");
			
			
			
}
	
//	@RequestMapping("/login" )
//	public String hello1() {
//		return "welcome";
//		
//	}
	@RequestMapping("/hello")
	public String hello() {
		return "index";
		
	}
}