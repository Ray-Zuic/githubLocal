package com.gao.entity;

public class Desk {
	private int id;
	private int DeskNo;
	private int userId;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeskNo() {
		return DeskNo;
	}
	public void setDeskNo(int deskNo) {
		DeskNo = deskNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Desk [id=" + id + ", DeskNo=" + DeskNo + ", userId=" + userId + ", userName=" + userName + "]";
	}
	
}
