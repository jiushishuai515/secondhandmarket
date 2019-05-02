package com.tjpu.service.impl;


import com.github.pagehelper.PageHelper;
import com.tjpu.dao.PurseMapper;
import com.tjpu.pojo.Purse;
import com.tjpu.service.PurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("PurserService")
public class PurseServiceImpl implements PurseService {
	@Autowired
	 private PurseMapper perseMapper;



	public void updatePurseByuserId(Integer userId, Float balance) {
		// TODO Auto-generated method stub
		perseMapper.updatePurseByuserId(userId, balance);
		
	}



	public void updatePurseOfdel(Integer userId, Float balance) {
		// TODO Auto-generated method stub
		perseMapper.updatePurseOfdel(userId, balance);
	}



	public void addPurse(Integer userId) {
		// TODO Auto-generated method stub
		perseMapper.addPurse(userId);
	}



	public Purse getPurseByUserId(Integer user_id) {
		// TODO Auto-generated method stub
		return perseMapper.selectPurseByUserId(user_id);
	}



	public void updatePurse(Purse purse) {
		// TODO Auto-generated method stub
		perseMapper.updatePurse(purse);
		
	}



	public int getPurseNum() {
		List<Purse> purse= perseMapper.selectPurseList();
		return purse.size();
	}



	public List<Purse> getPagePurse(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Purse> purse =perseMapper.selectPurseList();
		return purse;
	}



	public List<Purse> getPagePurseByPurse(Integer userId,Integer state, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Purse> purse =perseMapper.getPagePurseByPurse(userId,state);
		return purse;
	}



	public Purse getPurseById(int id) {
		return perseMapper.selectPurseById(id);
	}



	public void updateByPrimaryKey(Integer id, Purse purse) {
		purse.setId(id);
		perseMapper.updateByPrimaryKey(purse);
		
	}



	public void updatePursePassById(Integer id,Purse purse) {
		purse.setId(id);
		perseMapper.updatePurseById(purse);
		
	}



	public void updatePurseRefuseById(Integer id,Purse purse) {
		purse.setId(id);
		perseMapper.updatePurseById(purse);
		
	}


}
