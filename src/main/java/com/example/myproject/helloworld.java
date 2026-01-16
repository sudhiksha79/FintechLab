package com.example.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
	@GetMapping("/root")
	
	public String index() {
		return "hello world";
	}
	
}
