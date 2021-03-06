package com.eureka.client.user.service.bean;

public class HouseInfo {
	private String city;
	private String area;
	private String address;
	
	public HouseInfo() {
	}
	
	public HouseInfo(String city, String area, String address) {
		this.city = city;
		this.area = area;
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
