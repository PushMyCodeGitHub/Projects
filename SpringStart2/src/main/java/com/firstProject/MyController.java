package com.firstProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public ModelAndView data(@ModelAttribute Employee e1)
	{
		ModelAndView m1=new ModelAndView();
		m1.setViewName("emp-data");
		m1.addObject("e", e1);
		return m1;
	}
	
}
