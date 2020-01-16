package com.example.demo;

import com.example.demo.repository.UserRepository;
import com.example.demo2.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
		System.out.println(userRepository.findById(1).orElse(null));
		System.out.println(personRepository.findById(1).orElse(null));
	}

}
