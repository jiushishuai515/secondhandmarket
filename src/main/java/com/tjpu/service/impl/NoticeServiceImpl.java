package com.tjpu.service.impl;


import com.tjpu.dao.NoticeMapper;
import com.tjpu.pojo.Notice;
import com.tjpu.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("NoticeService")
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	 private NoticeMapper noticeMapper;


	public List<Notice> getNoticeList() {
		
		return noticeMapper.getNoticeList();
	}


	public void insertSelective(Notice notice) {
		noticeMapper.insertSelective(notice);
		
	}


	public Integer getUserIdByNoticeId(int id) {

		return noticeMapper.getUserIdByNoticeId(id);
	}


}
