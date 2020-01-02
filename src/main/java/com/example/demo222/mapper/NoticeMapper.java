package com.example.demo222.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo222.model.Notice;


@Mapper
public interface NoticeMapper {
	
	public int createNotice(Notice notice);
	public int deleteNotice(Notice notice);
	public Notice selectNoticeBynTitle(String nTitle);
}
