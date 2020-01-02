package com.example.demo222.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo222.model.User;
import com.example.demo222.service.RegisterService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class RegisterController {
	@Autowired
	RegisterService  registerService;
	
	@RequestMapping("/register")
	public JSONObject register (@RequestBody User user) {
		JSONObject result = new JSONObject();
		  
		//调用service层
		int i= registerService.register(user);
		result.put("state",i);
		 
		return result;
		
	}
	@RequestMapping("/login")
	public JSONObject login (User user) {
		JSONObject result = new JSONObject();
		int i= registerService.login(user);
		result.put("state",i);
		
		return result;
	}
	
}
