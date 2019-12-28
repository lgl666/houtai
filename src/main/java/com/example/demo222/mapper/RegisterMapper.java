package com.example.demo222.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo222.model.User;

@Mapper
public interface RegisterMapper {
	public User selectUserByUsername(String username);
	public int insertUser(User user);
}
