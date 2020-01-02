package com.example.demo222.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo222.mapper.NoticeMapper;
import com.example.demo222.model.Notice;
import com.example.demo222.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	NoticeMapper noticemapper;
	
	
	@Override
	public int createNotice(Notice notice) {
		// TODO Auto-generated method stub
		Notice nt =noticemapper.selectNoticeBynTitle(notice.gettTitle());
		
		int i=-1;
		if(nt==null) {
			i=noticemapper.createNotice(notice);
		}else {
			i=-1;
		}
		
		return i;
	}

	@Override
	public int deleteNotice(Notice notice) {
		// TODO Auto-generated method stub

Notice nt1 =noticemapper.selectNoticeBynTitle(notice.gettTitle());
		
		int i=-1;
		if(nt1!=null) {
			i=noticemapper.deleteNotice(notice);
		}else {
			
			i=-1;
		}
		
		return i;
		
	}
	}

	
	

