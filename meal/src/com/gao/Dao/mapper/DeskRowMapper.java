package com.gao.Dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gao.entity.Desk;
import com.gao.util.RowMapper;

public class DeskRowMapper implements RowMapper<Desk> {

	@Override
	public Desk mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Desk de = new Desk();
		de.setId(rs.getInt("id"));
		de.setDeskNo(rs.getInt("deskno"));
		de.setUserId(rs.getInt("userid"));
		de.setUserName(rs.getString("username"));
		return de;
	}

}
