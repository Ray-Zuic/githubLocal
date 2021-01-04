package com.gao.service;

import java.sql.SQLException;
import java.util.List;

import com.gao.entity.Info;
import com.gao.entity.User;

public interface ManagerOperateService {
	void publishInfo(Info info);
	List <Info> selectAll();
}
