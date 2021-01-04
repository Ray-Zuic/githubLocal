package com.gao.Dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gao.entity.HotelVotel;
import com.gao.util.RowMapper;

public class HotelVotelRowMapper implements RowMapper<HotelVotel> {

	@Override
	public HotelVotel mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		HotelVotel hv = new HotelVotel();
		hv.setHotelid(rs.getInt("hotelid"));
		hv.setHotelName(rs.getString("hotelname"));
		hv.setVoterName(rs.getString("votername"));
		return hv;
	}

}
