package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GetRestController {

	@RequestMapping(value = {"","/"})
	public String sayHello() {
		return "Hello From Bridgelabz!";
	}
	
	@GetMapping(value = {"/query"})
	public String printNameUsingQueryParam(@RequestParam(value = "name") String name) {
		return "Hello, " + name + " From Bridgelabz!";
	}
	
	@GetMapping(value = {"/param/{name}"})
	public String printNameUsingPathParam(@PathVariable String name) {
		return "Hello, " + name + " From Bridgelabz with Path!";
	}

}
