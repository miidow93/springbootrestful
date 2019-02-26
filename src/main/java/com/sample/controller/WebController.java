package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/test")
	public String test() {
		return "hello";
	}
	
	@GetMapping("/index")
	public String homepage() {	
		return "index";
	}
}
