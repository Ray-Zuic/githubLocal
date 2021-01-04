package com.gao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	static{//加载驱动 用静态代码可以先执行，且只执行一次
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection conn=threadLocal.get();//为每个线程提供局部变量
		if(null==conn){//起初没有connection
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tt?useUnicode=true&characterEncoding=utf8","root","980914");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//再把conn绑定到threadLocal变量中
		threadLocal.set(conn);
		}
		//System.out.println(conn);
		return conn;
	}
	
	public static void close(){
		Connection conn = threadLocal.get();
		threadLocal.remove();
		//先清除ThreadLocal中Connection
		if(null!=conn){
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void close(PreparedStatement pstmt){
		if(null!=pstmt){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs){
		if(null!=rs)
			try{
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
