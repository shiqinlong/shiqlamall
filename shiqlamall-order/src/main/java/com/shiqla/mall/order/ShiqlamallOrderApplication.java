package com.shiqla.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.shiqla.mall.order.dao")
@EnableDiscoveryClient
public class ShiqlamallOrderApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallOrderApplication.class, args);
    }

}
