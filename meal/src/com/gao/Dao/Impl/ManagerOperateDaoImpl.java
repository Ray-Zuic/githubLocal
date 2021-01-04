package com.gao.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import com.gao.Dao.ManagerOperateDao;
import com.gao.Dao.mapper.InfoRowMapper;
import com.gao.Dao.mapper.UserRowMapper;
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
		String sql = "select * from info order by date desc";
		return JdbcTemplate.selectList(sql, new InfoRowMapper());
	}

}
