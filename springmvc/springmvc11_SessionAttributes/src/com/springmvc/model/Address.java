package com.springmvc.model;

/**
 * User的级联属性
 * @author chai
 *
 */
public class Address {

	private String province;  //省
	private String city;  //市
	private String county;  //县
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
	@Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + ", county="
				+ county + "]";
	}
	
}
