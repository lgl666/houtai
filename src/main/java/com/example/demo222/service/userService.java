package com.example.demo222.service;

import java.util.List;

import com.example.demo222.model.User;

public interface userService {

	public List<User> getUserList();
	public int updateUser(User user);
	public int deleteUser(User user);
}
