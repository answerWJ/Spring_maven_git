package com.wj.service;

import com.wj.pojo.User;

/** 
  * @author  作者 E-mail: zyj_daan@163.com
  * @date 创建时间：2016年8月18日  下午4:45:14 
  * @version 1.0 
  * @Description: TODO  
  * @since  JDK 1.8
  * @return  
  */

public interface UserService {
	public int insertUser(User user);
	
	public User getUserById(int id);
}
