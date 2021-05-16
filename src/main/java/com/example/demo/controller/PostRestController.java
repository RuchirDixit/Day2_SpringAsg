package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/post")
public class PostRestController {

	// POST api with User DTO
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return "Hello, " + user.getFirstName() + " " + user.getLastName() + " From BridgeLabz!";
	}
}
