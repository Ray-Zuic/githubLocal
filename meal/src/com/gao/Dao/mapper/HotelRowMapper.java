package com.gao.Dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gao.entity.Hotel;
import com.gao.util.RowMapper;

public class HotelRowMapper implements RowMapper<Hotel> {

	@Override
	public Hotel mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Hotel ht = new Hotel();
		ht.setId(rs.getInt("id"));
		ht.setName(rs.getString("name"));
		return ht;
	}

}
