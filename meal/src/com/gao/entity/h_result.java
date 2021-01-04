package com.gao.entity;

public class h_result {
	private String hotelname;
	private int count;
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "h_result [hotelname=" + hotelname + ", count=" + count + "]";
	}
	
}
