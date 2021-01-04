package com.gao.Dao;

import java.sql.SQLException;
import java.util.List;

import com.gao.entity.Info;
import com.gao.entity.User;

public interface ManagerOperateDao {
	void publishInfo(Info info) throws SQLException;

	List <Info> selectAll()throws SQLException;
}
