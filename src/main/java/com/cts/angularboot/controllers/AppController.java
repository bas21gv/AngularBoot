package com.cts.angularboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	String home(ModelMap model){
		model.addAttribute("title", "CRUD Spring App");
		return "index";
	}
	
	@RequestMapping("/partial/{page}")
	String partialHandler(@PathVariable("page") final String page){
		return page;
	}
}
