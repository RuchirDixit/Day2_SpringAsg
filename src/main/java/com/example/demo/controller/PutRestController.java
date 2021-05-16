package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/put")
public class PutRestController {

	// Put API with firstName as path variable and lastName as query parameter
	@PutMapping("/{firstName}")
	public String showUser(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
		return "Hello..." + firstName + " " + lastName + " From BridgeLabz!!!";
	}
}
