package com.hjyoon.boarddemo.service.impl;

import com.hjyoon.boarddemo.dao.UserMapper;
import com.hjyoon.boarddemo.domain.UserDomain;
import com.hjyoon.boarddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

/*	@Override public void update(UserDomain user) {
		userMapper.update(user);
	}

	@Override public void insert(UserDomain user) {
		userMapper.insert(user);
	}

	@Override public void delete(int userNo) {
		userMapper.delete(userNo);
	}
	*/
	@Override public UserDomain findByUserNo(int userNo) {
		return userMapper.findByUserNo(userNo);
	}

	@Override public List<UserDomain> findAll() {
		return userMapper.findAll();
	}

}
