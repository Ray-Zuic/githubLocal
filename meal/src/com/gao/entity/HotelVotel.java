package com.gao.entity;

public class HotelVotel {
	private int hotelid;
	private String hotelName;
	private String voterName;
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	@Override
	public String toString() {
		return "HotelVotel [hotelid=" + hotelid + ", hotelName=" + hotelName + ", voterName=" + voterName + "]";
	}
	
}
