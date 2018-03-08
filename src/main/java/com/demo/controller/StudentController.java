package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {
	
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model){
		String name="李";
		Logger logger= LoggerFactory.getLogger(StudentController.class);
		logger.debug("我是debug日志");
		logger.info("hello{}",name);
		model.addAttribute("name",name);
		return "Hello.ftl";
		
	}
}
