package com.sogeti.dockerjenkinsintegration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/api")
public class HelloController {

	@GetMapping(value = "hello")
	public String hello(Model model) {
		String hello = "Hello world !!";
		model.addAttribute(hello, hello);
		return "/hello";
	}
	
}
