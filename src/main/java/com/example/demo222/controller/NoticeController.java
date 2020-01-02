package com.example.demo222.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo222.mapper.NoticeMapper;
import com.example.demo222.model.Notice;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	NoticeMapper noticeMapper;
	
	@RequestMapping("/Create")
	public JSONObject Create(Notice notice) {
		JSONObject result = new JSONObject();
		int i =noticeMapper.createNotice(notice);
		result.put("state", i);
		 return result;
	
	}
	@RequestMapping("/delete")
	public JSONObject delete(Notice notice) {
		JSONObject result = new JSONObject();
		int i =noticeMapper.deleteNotice(notice);
		result.put("state", i);
		 return result;
		

	}
}
