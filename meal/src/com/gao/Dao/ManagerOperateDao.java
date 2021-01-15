package com.gao.Dao;

import java.sql.SQLException;
import java.util.List;

import com.gao.entity.Hotel;
import com.gao.entity.Info;
import com.gao.entity.User;

public interface ManagerOperateDao {
	void publishInfo(Info info) throws SQLException;

	List <Info> selectAll()throws SQLException;
	
	void addHotel(String name) throws SQLException;
	void delHotel(String name) throws SQLException;
	void delAllHotelVotel(String name)throws SQLException;
	
	List <Hotel> getHotelList() throws SQLException;
	
	User checkUser(String account) throws SQLException;
}
