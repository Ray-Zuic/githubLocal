package com.gao.Dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gao.entity.h_result;
import com.gao.util.RowMapper;

public class H_resultRowMapper implements RowMapper<h_result> {

	@Override
	public h_result mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub

		h_result h = new h_result();
		h.setHotelname(rs.getString("hotelname"));
		h.setCount(rs.getInt("cn"));
		
		return h;
	}

}
