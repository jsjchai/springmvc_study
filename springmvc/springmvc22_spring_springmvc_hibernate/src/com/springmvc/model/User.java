package com.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * JSR 303 ����ȷ
 *
 */
@Entity
@Table(name="springmvc_user")
public class User {

	private int id;
	//@NotEmpty(message="���ֲ���Ϊ��")
	private String name;
	//@NotEmpty(message="��ַ����Ϊ��")
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
