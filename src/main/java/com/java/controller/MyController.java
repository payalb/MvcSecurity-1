package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class MyController {

	@GetMapping(produces="text/html")
	public String getData() {
		return "Hello";
	}
}
