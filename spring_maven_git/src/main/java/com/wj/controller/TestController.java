package com.wj.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wj.pojo.User;

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

//	public static void main(String[] args) {
//		SpringApplication.run(TestController.class);
//		System.out.println("sdfasf");
//	}
}
