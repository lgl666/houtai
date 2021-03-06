package com.example.demo222.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo222.model.User;

@Mapper
public interface RegisterMapper {
	
	public User selectUserByUsername(String username);
	public User selectUserByPassword(String password);
	public int insertUser(User user);
	public int login(User user);
}
