package com.gao.Dao;

import java.sql.SQLException;
import java.util.List;

import com.gao.entity.Desk;
import com.gao.entity.Hotel;
import com.gao.entity.HotelVotel;
import com.gao.entity.Info;
import com.gao.entity.User;
import com.gao.entity.h_result;

public interface UserOperateDao {

	User login(String user) throws SQLException;
	List <Hotel> selectAllHotel()throws SQLException;
	void selectHotel(HotelVotel hv)throws SQLException;
	
	HotelVotel checkh(String name)throws SQLException; 
	void update(HotelVotel hv)throws SQLException;
	
	Hotel getHotel(String name)throws SQLException;
	
	List <h_result> selectResult()throws SQLException;
	
	
	void choseDesk(Desk d)throws SQLException;
	Desk checkD(String name)throws SQLException;
	void updateD(Desk d)throws SQLException;
	
	List <Desk> showDesks()throws SQLException;
	
	void reg(User user)throws SQLException;
}
