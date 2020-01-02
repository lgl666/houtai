package com.example.demo222.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo222.mapper.userMapper;
import com.example.demo222.model.User;
import com.example.demo222.service.userService;

@Service
public class userServiceImpl  implements userService{

	@Autowired
	userMapper userMapper;

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser();
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		
		User us = userMapper.selectUserByUsername(user.getUsername());
		int i =-1;
		if(us!=null) {
			i=userMapper.updateUser(user);
		}else {
			i=-1;
		}
		return i;
	}

	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub

		User us1 = userMapper.selectUserByUsername(user.getUsername());
		int i =-1;
		if(us1!=null) {
			i=userMapper.deleteUser(user);
		}else {
			i=-1;
		}
		return i;
	}

	
	
	
}
