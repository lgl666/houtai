package com.example.demo222.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo222.model.User;
import com.example.demo222.service.GoodsService;
import com.example.demo222.service.userService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class userController {
	@Autowired
	userService userService;

	@RequestMapping("/selectUser")
	public List<User> selectUser(){
		return userService.getUserList();
	}
	@RequestMapping("/updateUser")
	public JSONObject updateMapper(User user) {
		JSONObject result = new JSONObject();
		return result;
	}
	@RequestMapping("/deleteUser")
	public JSONObject deleteUser(User user) {
		JSONObject result = new JSONObject();
		return result;
}
}