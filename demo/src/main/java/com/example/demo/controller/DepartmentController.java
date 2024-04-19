package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@GetMapping("/dept")
	public String greet() {
		return "From Department";
	}
}
