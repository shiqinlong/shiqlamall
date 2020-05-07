package com.shiqla.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shiqla.mall.member.dao")
public class ShiqlamallMemberApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallMemberApplication.class, args);
    }

}
