package com.springmvc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.UserDao;
import com.springmvc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		List<User> userList=this.getSession().createQuery(
				"From User")
				.list();
		return userList;
	}

	@Override
	public void add(User user) {
		if(user!=null){
			this.getSession().save(user);
		}
	}

	@Override
	public void delete(int id) {
		if(id!=0){
			User user=this.getById(id);
			if(user!=null){
				this.getSession().delete(user);
			}
		}
		
	}

	@Override
	public User getById(int id) {
		if(id == 0){
			return null;
		}
		return (User) this.getSession().get(User.class, id);
	}

	@Override
	public void update(User user) {
		this.getSession().update(user);
	}

}
