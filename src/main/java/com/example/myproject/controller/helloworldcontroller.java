package com.example.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
	@GetMapping("/controller")
	
	public String index() {
		return "Hello World";
	}
	
}
