package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.User;

public interface UserDao {

	List<User> findAll();

	void add(User user);

	void delete(int id);
	
	User getById(int id);

	void update(User user);

}
