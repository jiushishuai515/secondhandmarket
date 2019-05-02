package com.tjpu.dao;


import com.tjpu.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer id);
    
	public List<Notice> getNoticeList();

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    int updateByPrimaryKey(Notice record);

    Integer getUserIdByNoticeId(int id);
}