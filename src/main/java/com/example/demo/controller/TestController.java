package com.example.demo.controller;

import com.example.demo.repository.UserRepository;
import com.example.demo2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PersonRepository personRepository;

}
