package com.tjpu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("com.tjpu.dao")
@EntityScan("com.tjpu.pojo")
public class SecondhandmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondhandmarketApplication.class, args);
    }

}
