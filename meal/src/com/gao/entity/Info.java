package com.gao.entity;

public class Info {
	private int id;
	private String context;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Info [id=" + id + ", context=" + context + ", date=" + date + "]";
	}
	
}
