package com.hjyoon.boarddemo.dao;


import com.hjyoon.boarddemo.domain.UserDomain;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

	public List<UserDomain> findAll();

	public UserDomain findByUserNo(@Param("userNo") int userNo);

	//@Select("SELECT * FROM user WHERE userName=#{name}")
	//public List<UserDomain> findByName(@Param("name") String name);

	//@Insert("INSERT INTO user(id, password, status, name,) VALUES (#{id}, #{password}, #{status}, #{name} )")
	//public void insert(UserDomain user);

	//@Update("UPDATE user SET password=#{password}, status=#{status}, name=#{name} where userNo=#{userNo}")
	//public void update(UserDomain user);

	//@Delete("DELETE FROM user where bno=#{bno}")
	//public void delete(@Param("bno") int bno);

}
