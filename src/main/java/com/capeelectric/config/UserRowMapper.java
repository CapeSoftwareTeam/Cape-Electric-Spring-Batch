package com.capeelectric.config;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.springframework.jdbc.core.RowMapper;

import com.capeelectric.model.User;



public class UserRowMapper implements RowMapper<User> {
	private static final DateTimeFormatter DT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
 		return User.builder()
				.id(rs.getInt("user_id"))
				.password(rs.getString("password"))
				.email(rs.getString("email"))
				.firstname(rs.getString("first_name"))
				.lastname(rs.getString("last_name"))
				.username(rs.getString("user_name"))
				.creationdate(LocalDateTime.parse(rs.getString("creation_date"), DT_FORMAT))
				.updateddate(LocalDateTime.parse(rs.getString("updated_date"), DT_FORMAT))
				
				.build(); 
 	}
	
}