package com.springboot.demo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
		
	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server issssss123 " + LocalDateTime.now();
	}
	
}












