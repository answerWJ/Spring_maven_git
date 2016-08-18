package com.wj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.dao.UserDao;
import com.wj.pojo.User;
import com.wj.service.UserService;

/** 
  * @author  作者 E-mail: zyj_daan@163.com
  * @date 创建时间：2016年8月18日  下午4:48:26 
  * @version 1.0 
  * @Description: TODO  
  * @since  JDK 1.8
  * @return  
  */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public User getUserById(int id) {
		User u = null;
		try {
			u =  userDao.getUserById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

}
