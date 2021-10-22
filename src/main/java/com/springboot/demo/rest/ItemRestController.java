package com.springboot.demo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemRestController {
	@Value("${item.name}")
	private String itemName;

	@Value("${item.quantity}")
	private String itemQuantity;

	@GetMapping("/item")
	public String getItemInfo(){
		return "itemName= " + itemName +
				", itemQuantity= " + itemQuantity;
	}

	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
}












