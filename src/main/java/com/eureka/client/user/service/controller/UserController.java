package com.eureka.client.user.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/user/hello")
	public String hello() {
		return "ok_hello";
	}
	
}
