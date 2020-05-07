package com.shiqla.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shiqla.mall.ware.dao")
public class ShiqlamallWareApplication
{
    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallWareApplication.class, args);
    }
}
