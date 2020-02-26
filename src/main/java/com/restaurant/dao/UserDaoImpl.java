package com.restaurant.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.restaurant.model.UserDTO;

@Component
public class UserDaoImpl implements IUserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public UserDTO getUserDetailsByName(String userName) {
		UserDTO user = new UserDTO();
		try {
		System.out.println("username==" + userName);
		String sql = "select * from  Login_Details where User_Name='"+userName+"'";
		//String sql = "select * from  user where username='"+userName+"'";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
           if(null !=rows) {
		  for (Map<?, ?> row : rows) {
		  user.setUsername(row.get("User_Name").toString());
		  user.setPassword(row.get("Password").toString());
		  }
          }

		}catch(Exception e) {
			System.out.println("exeception=="+e.getMessage());
			e.printStackTrace();
			
		}
		return user;
	}

}
