package com.tjpu.service.impl;

import com.tjpu.dao.FocusMapper;
import com.tjpu.pojo.Focus;
import com.tjpu.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("focusService")
public class FocusServiceImpl implements FocusService {

	@Autowired
	 private FocusMapper focusMapper;

	 /**
	  * 根据用户id获取我的关注
	  */
	 public List<Focus> getFocusByUserId(Integer user_id) {
		List<Focus> focusList = focusMapper.getFocusByUserId(user_id);
				
        return focusList;
	}
	 
	 /*
	  * 根据用户id和关注id删除
	  */

	public void deleteFocusByUserIdAndGoodsId(Integer goods_id, Integer user_id) {
		
		focusMapper.deleteFocusByUserIdAndGoodsId(goods_id, user_id);
		
	}
	/*
	  * 添加我的关注
	  */
	public void addFocusByUserIdAndId(Integer goods_id, Integer user_id) {
		
		focusMapper.addFocusByUserIdAndGoodsId(goods_id,user_id);
		
	}

}
