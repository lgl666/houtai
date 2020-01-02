package com.example.demo222.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo222.mapper.RegisterMapper;
import com.example.demo222.model.User;
import com.example.demo222.service.RegisterService;

@Service
public class RegisterServiceImpl  implements RegisterService{
	
	@Autowired
	RegisterMapper  registerMapper;

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
			User u = registerMapper.selectUserByUsername(user.getUsername());
			int i=-1;
		if(u==null) {
			i = registerMapper.insertUser(user);
		}else {
			i=-2;
		}
		
		return i;
	}

	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
		User u1 = registerMapper.selectUserByUsername(user.getUsername());
		User u2 = registerMapper.selectUserByPassword(user.getPassword());
		int i=-1;
		if(u1==u2) {
			i=-1;
			System.out.println("登录成功");
		}else {
			i=-2;
			System.out.println("用户名或密码错误");
		}
		return i;
	}


}
