package com.shiqla.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.shiqla.mall.ware.dao")
@EnableDiscoveryClient
public class ShiqlamallWareApplication
{
    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallWareApplication.class, args);
    }
}
