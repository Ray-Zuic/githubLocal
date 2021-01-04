package com.gao.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import com.gao.Dao.UserOperateDao;
import com.gao.Dao.mapper.DeskRowMapper;
import com.gao.Dao.mapper.H_resultRowMapper;
import com.gao.Dao.mapper.HotelRowMapper;
import com.gao.Dao.mapper.HotelVotelRowMapper;
import com.gao.Dao.mapper.UserRowMapper;
import com.gao.entity.Desk;
import com.gao.entity.Hotel;
import com.gao.entity.HotelVotel;
import com.gao.entity.User;
import com.gao.entity.h_result;
import com.gao.util.JdbcTemplate;

public class UserOperateDaoImpl implements UserOperateDao {

	@Override
	public User login(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from user where username=?";		
		return JdbcTemplate.selectOne(sql, new UserRowMapper(), name);
	}

	@Override
	public List<Hotel> selectAllHotel() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from Hotel";
		return JdbcTemplate.selectList(sql, new HotelRowMapper());
	}

	@Override
	public void selectHotel(HotelVotel hv) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into hotel_vote values(?,?,?)";
		JdbcTemplate.insert(sql, hv.getHotelid(),hv.getHotelName(),hv.getVoterName());
	}

	@Override
	public HotelVotel checkh(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from hotel_vote where votername=?";		
		return JdbcTemplate.selectOne(sql, new HotelVotelRowMapper(), name);
	}

	@Override
	public Hotel getHotel(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from hotel where name=?";		
		return JdbcTemplate.selectOne(sql, new HotelRowMapper(), name);
	}

	@Override
	public void update(HotelVotel hv) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update hotel_vote set hotelid =? , hotelname = ? where votername = ?";
		JdbcTemplate.insert(sql, hv.getHotelid(),hv.getHotelName(),hv.getVoterName());
	}

	@Override
	public List<h_result> selectResult() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT hotelname,COUNT(*) cn FROM hotel_vote GROUP BY hotelname ORDER BY hotelid";
		return JdbcTemplate.selectList(sql, new H_resultRowMapper());
	}

	@Override
	public void choseDesk(Desk d) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into desk (deskno,userid,username) values(?,?,?)";
		JdbcTemplate.insert(sql, d.getDeskNo(),d.getUserId(),d.getUserName());
	}

	@Override
	public Desk checkD(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from desk where username=?";		
		return JdbcTemplate.selectOne(sql, new DeskRowMapper(), name);
	}

	@Override
	public void updateD(Desk d) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update desk set deskno =?  where userid = ?";
		JdbcTemplate.insert(sql, d.getDeskNo(),d.getUserId());
	}

	@Override
	public List<Desk> showDesks() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM desk ORDER BY deskno";
		return JdbcTemplate.selectList(sql, new DeskRowMapper());
	}

}
