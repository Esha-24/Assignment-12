package org.antwalk.model;

public class Valentine {
	private String day;
	private String gift;
	private String location;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Valentine(String day, String gift, String location) {
		super();
		this.day = day;
		this.gift = gift;
		this.location = location;
	}
	public Valentine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
