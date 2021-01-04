package com.gao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	static{//�������� �þ�̬���������ִ�У���ִֻ��һ��
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection conn=threadLocal.get();//Ϊÿ���߳��ṩ�ֲ�����
		if(null==conn){//���û��connection
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tt?useUnicode=true&characterEncoding=utf8","root","980914");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ٰ�conn�󶨵�threadLocal������
		threadLocal.set(conn);
		}
		//System.out.println(conn);
		return conn;
	}
	
	public static void close(){
		Connection conn = threadLocal.get();
		threadLocal.remove();
		//�����ThreadLocal��Connection
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
