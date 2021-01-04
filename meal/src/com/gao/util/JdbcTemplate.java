package com.gao.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
	public static void insert(String sql,Object ...params ) throws SQLException{
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			setParams(pstmt,params);
			pstmt.executeUpdate();
			
		}finally{
			JdbcUtil.close(pstmt);
		}
	}
	
	public static <E> E selectOne(String sql,RowMapper<E> rowMapper,Object...params) throws SQLException{
		List<E> objs = selectList(sql,rowMapper,params);
		if(objs.size()>0){
			return objs.get(0);
		}else{
			return null;
		}
	}
	public static <E>List<E> selectList(String sql,RowMapper<E> rowMapper,Object...params) throws SQLException{
		List<E> objs = new ArrayList<E>();
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			pstmt = conn.prepareStatement(sql);
			setParams(pstmt,params);
			rs=pstmt.executeQuery();
			while(rs.next()){
				E obj = rowMapper.mapper(rs);
				objs.add(obj);
			}
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return objs;
	}
	
	private static void setParams(PreparedStatement pstmt,Object...params) throws SQLException{
		if(null!=params && params.length>0){
			for(int i=0;i<params.length;i++){
					pstmt.setObject((i+1), params[i]);
			}
		}
	}
}
