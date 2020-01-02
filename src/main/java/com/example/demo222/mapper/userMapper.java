package com.example.demo222.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo222.model.User;

@Mapper
public interface userMapper {
	public List<User> selectAllUser	();
	public User selectUserByUsername(String username);
	public int updateUser(User user);
	public int deleteUser(User user);
}
