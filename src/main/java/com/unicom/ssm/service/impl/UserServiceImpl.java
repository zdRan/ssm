package com.unicom.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicom.ssm.dao.IUserDao;
import com.unicom.ssm.domain.User;
import com.unicom.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	IUserDao userDao;
	
	public User getUserByName(String name) {
		return userDao.selectByName(name);
	}

}
