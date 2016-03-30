package com.springmvc.service;

import java.util.List;

import com.springmvc.model.User;

public interface UserService {

	List<User> findAll();

	void save(User user);

	void delete(int id);

	User getById(int id);

	void update(User user);

}
