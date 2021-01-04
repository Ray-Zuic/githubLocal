package com.gao.service.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gao.Dao.UserOperateDao;
import com.gao.Dao.Impl.UserOperateDaoImpl;
import com.gao.entity.Desk;
import com.gao.entity.Hotel;
import com.gao.entity.HotelVotel;
import com.gao.entity.Info;
import com.gao.entity.User;
import com.gao.entity.h_result;
import com.gao.service.UserOperateService;
import com.gao.util.Transaction;

public class UserOperateServiceImpl implements UserOperateService {

	private UserOperateDao userDao = new UserOperateDaoImpl();
	private Transaction tx = new Transaction();
	@Override
	public User login(String name) {
		// TODO Auto-generated method stub
		tx.begin();
		User user = new User();
		try {
			user = userDao.login(name);;
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public List<Hotel> selectAllHotel() {
		// TODO Auto-generated method stub
		List<Hotel> HotelList= new ArrayList();
		tx.begin();
		try {
			HotelList = userDao.selectAllHotel();
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return HotelList;
	}
	@Override
	public void selectHotel(HotelVotel hv) {
		// TODO Auto-generated method stub
		tx.begin();
		try {
			userDao.selectHotel(hv);
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public HotelVotel checkh(String name) {
		// TODO Auto-generated method stub
		tx.begin();
		HotelVotel user = new HotelVotel();
		try {
			user = userDao.checkh(name);;
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public Hotel getHotel(String name) {
		// TODO Auto-generated method stub
		tx.begin();
		Hotel user = new Hotel();
		try {
			user = userDao.getHotel(name);;
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public void update(HotelVotel hv) {
		// TODO Auto-generated method stub
		tx.begin();
		User user = new User();
		try {
			userDao.update(hv);
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<h_result> selectResult() {
		// TODO Auto-generated method stub
		List<h_result> HotelList= new ArrayList();
		tx.begin();
		try {
			HotelList = userDao.selectResult();
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return HotelList;
	}
	@Override
	public void choseDesk(Desk d) {
		// TODO Auto-generated method stub
		tx.begin();

		try {
			userDao.choseDesk(d);
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Desk checkD(String name) {
		// TODO Auto-generated method stub
		tx.begin();
		Desk user = new Desk();
		try {
			user = userDao.checkD(name);;
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public void updateD(Desk d) {
		// TODO Auto-generated method stub
		tx.begin();
		try {
			userDao.updateD(d);;
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Desk> showDesks() {
		// TODO Auto-generated method stub
		List<Desk> HotelList= new ArrayList();
		tx.begin();
		try {
			HotelList = userDao.showDesks();
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return HotelList;
	}

}
