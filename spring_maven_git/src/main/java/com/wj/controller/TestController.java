package com.wj.controller;

import java.util.ArrayList;
import java.util.List;

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
	
	@RequestMapping("/getUsers")
	public List<User> view() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1L);
		user.setName("zhang");
		list.add(user);
		User user2 = new User();
		user2.setId(2L);
		user2.setName("li");
		list.add(user2);
		return list;
	}
	
	@RequestMapping("/tt")
	public String tt() {
		return "qu ni da fff dfasdfasf dfgdsg dfgsdf ye";
	}
	
	@RequestMapping("/test")
	public int test() {
		return 100/0;
	}

}
