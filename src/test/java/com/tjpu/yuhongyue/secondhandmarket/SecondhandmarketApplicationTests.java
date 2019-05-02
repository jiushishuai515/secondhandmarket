package com.tjpu.yuhongyue.secondhandmarket;

import com.tjpu.dao.NoticeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecondhandmarketApplicationTests {
    @Autowired
    NoticeMapper noticeMapper;

    @Test
    public void contextLoads() {

        Integer a=noticeMapper.getUserIdByNoticeId(20);
        System.out.println(a);
    }

}
