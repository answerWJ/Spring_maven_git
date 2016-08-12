package com.wj.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wj.pojo.User;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id) {
		User user = new User();
		user.setId(id);
		user.setName("zhang");
		return user;
	}
	
	@RequestMapping("/tt")
	public String tt() {
		return "qu ni da ye";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestController.class,args);
//		System.out.println("sdfasf");
	}
}
