package com.gao.Dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gao.entity.Info;
import com.gao.util.RowMapper;

public class InfoRowMapper implements RowMapper<Info> {

	@Override
	public Info mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Info info = new Info();
		info.setId(rs.getInt("id"));
		info.setContext(rs.getString("context"));
		info.setDate(rs.getString("date"));
		return info;
	}

}
