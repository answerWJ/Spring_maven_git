package com.wj.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.wj.pojo.User;


/** 
  * @author  作者 E-mail: zyj_daan@163.com
  * @date 创建时间：2016年8月18日  下午3:41:21 
  * @version 1.0 
  * @Description: TODO  
  * @since  JDK 1.8
  * @return  
  */

@Repository
public class UserDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user){
		StringBuilder sql = new StringBuilder();
		sql.append("insert into User(id,name) values(?,?)");
		int id = jdbcTemplate.update(sql.toString(),new Object[]{user.getId(),user.getName()});
		return id;
		
	}
	
	public User getUserById(int id) throws Exception{
		String sql = "select * from User where id=?";
	       RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
	       return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}
}
