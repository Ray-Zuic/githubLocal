package com.gao.service.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gao.Dao.ManagerOperateDao;
import com.gao.Dao.Impl.ManagerOperateDaoImpl;
import com.gao.entity.Info;

import com.gao.entity.User;
import com.gao.service.ManagerOperateService;
import com.gao.util.Transaction;

public class ManagerOperateServiceImpl implements ManagerOperateService {

	
	private ManagerOperateDao managerDao = new ManagerOperateDaoImpl();
	private Transaction tx = new Transaction();
	
	public void publishInfo(Info info) {
		// TODO Auto-generated method stub
		tx.begin();
		try {
			managerDao.publishInfo(info);
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Info> selectAll() {
		// TODO Auto-generated method stub
		List<Info> infoList= new ArrayList();
		tx.begin();
		try {
			infoList = managerDao.selectAll();
			tx.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infoList;
	}

}
