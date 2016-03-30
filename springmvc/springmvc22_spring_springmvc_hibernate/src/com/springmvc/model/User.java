package com.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * JSR 303 不正确
 *
 */
@Entity
@Table(name="springmvc_user")
public class User {

	private int id;
	//@NotEmpty(message="名字不能为空")
	private String name;
	//@NotEmpty(message="地址不能为空")
	private String address;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
