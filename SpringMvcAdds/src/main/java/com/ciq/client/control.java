package com.ciq.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class control {
	
	@RequestMapping(value="/adds",method = RequestMethod.GET)
	
	public ModelAndView addlogic(@RequestParam("txtnum1") int a,@RequestParam("txtnum2")int c)
	{
		return new ModelAndView("welcome","result",a+c);
		
	}
	
	
	

}
