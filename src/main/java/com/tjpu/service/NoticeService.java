package com.tjpu.service;


import com.tjpu.pojo.Notice;

import java.util.List;

public interface NoticeService {

	List<Notice> getNoticeList();
	
	public void insertSelective(Notice notice);


    Integer getUserIdByNoticeId(int id);
}
