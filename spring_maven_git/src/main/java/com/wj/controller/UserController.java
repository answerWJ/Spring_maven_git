package com.wj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wj.pojo.User;
import com.wj.service.UserService;

/** 
  * @author  作者 E-mail: zyj_daan@163.com
  * @date 创建时间：2016年8月18日  下午4:55:13 
  * @version 1.0 
  * @Description: TODO  
  * @since  JDK 1.8
  * @return  
  */

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/save")
	public void addUser(){
		User user = new User();
		user.setName("马化腾");
		userService.insertUser(user);
	}
	@RequestMapping("/getUser")
	public User getUser(int id){
		return userService.getUserById(id);
	}
}
