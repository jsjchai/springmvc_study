package com.springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void save(User user) {
		userDao.add(user);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	
	

}
