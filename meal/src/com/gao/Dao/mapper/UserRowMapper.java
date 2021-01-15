package com.gao.Dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gao.entity.User;
import com.gao.util.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setMark(rs.getInt("mark"));
		user.setAccount(rs.getString("account"));
		return user;
	}

}
