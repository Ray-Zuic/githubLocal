package com.gao.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import com.gao.Dao.ManagerOperateDao;
import com.gao.Dao.mapper.HotelRowMapper;
import com.gao.Dao.mapper.InfoRowMapper;
import com.gao.Dao.mapper.UserRowMapper;
import com.gao.entity.Hotel;
import com.gao.entity.Info;
import com.gao.entity.User;
import com.gao.util.JdbcTemplate;

public class ManagerOperateDaoImpl implements ManagerOperateDao {

	public void publishInfo(Info info) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into info (context,date) values(?,?)";
		JdbcTemplate.insert(sql, info.getContext(),info.getDate());
	}

	@Override
	public List<Info> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from info order by id desc";
		return JdbcTemplate.selectList(sql, new InfoRowMapper());
	}

	@Override
	public void addHotel(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into hotel (name) values(?)";
		JdbcTemplate.insert(sql, name);
	}

	@Override
	public List<Hotel> getHotelList() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from hotel";
		return JdbcTemplate.selectList(sql, new HotelRowMapper());
	}

	@Override
	public void delHotel(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from hotel where name = ?";
		JdbcTemplate.insert(sql, name);
	}

	@Override
	public void delAllHotelVotel(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from hotel_vote where hotelname = ?";
		JdbcTemplate.insert(sql, name);
	}

	@Override
	public User checkUser(String account) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from user where account = ?";
		return JdbcTemplate.selectOne(sql, new UserRowMapper(), account);
	}
}
