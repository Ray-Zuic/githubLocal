package com.gao.util;

import java.sql.Connection;
import java.sql.SQLException;

public class Transaction {
	public void begin() {
		Connection conn = JdbcUtil.getConnection();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void commit() {
		Connection conn = JdbcUtil.getConnection();
		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close();
		}
	}
	public void rollback() {
		Connection conn = JdbcUtil.getConnection();
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close();
		}
	}
}
