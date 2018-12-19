package com.hjyoon.boarddemo.service;

import com.hjyoon.boarddemo.domain.UserDomain;

import java.util.List;

public interface UserService {
	public List<UserDomain> findAll();
	public UserDomain findByUserNo(int userNo);
/*	public void insert(UserDomain user);
	public void update(UserDomain user);
	public void delete(int userNo);*/
}
