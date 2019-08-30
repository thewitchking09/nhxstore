package com.org.thewitchking.nhxstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nhxstore")
public class RestControllerClass {

	@GetMapping("/get")
	public String get() {
		return "hello";
	}
	
}
