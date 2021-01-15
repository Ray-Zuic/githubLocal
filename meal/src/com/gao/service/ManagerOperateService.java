package com.gao.service;

import java.sql.SQLException;
import java.util.List;

import com.gao.entity.Hotel;
import com.gao.entity.Info;
import com.gao.entity.User;

public interface ManagerOperateService {
	void publishInfo(Info info);
	List <Info> selectAll();
	
	void addHotel(String name);
	void delHotel(String name);
	void delAllHotelVote(String name);
	List <Hotel> getHotelList();
	
	User checkUser(String name);
}
