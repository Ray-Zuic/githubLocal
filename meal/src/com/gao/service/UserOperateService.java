package com.gao.service;

import java.sql.SQLException;
import java.util.List;

import com.gao.entity.Desk;
import com.gao.entity.Hotel;
import com.gao.entity.HotelVotel;
import com.gao.entity.Info;
import com.gao.entity.User;
import com.gao.entity.h_result;

public interface UserOperateService {
	User login(String name);
	List <Hotel> selectAllHotel();
	void selectHotel(HotelVotel hv);
	
	HotelVotel checkh(String name);
	void update(HotelVotel hv);
	
	Hotel getHotel(String name);
	
	List<h_result> selectResult();
	
	void choseDesk(Desk d);
	Desk checkD(String name);
	void updateD(Desk d);
	
	List<Desk> showDesks();
	
	void reg(User user);
}
