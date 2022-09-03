package com.gate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userfallback")
	public String getLastNameFallback() {
		return "User Service is failed.";
	}
	
	@GetMapping("/departmentfallback")
	public String getFirstNameFallback() {
		return "Department Service is failed.";
	}
	
}
