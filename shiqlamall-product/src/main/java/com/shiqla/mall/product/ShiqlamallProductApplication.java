package com.shiqla.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.shiqla.mall.product.dao")
@EnableDiscoveryClient
@EnableTransactionManagement
public class ShiqlamallProductApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallProductApplication.class, args);
    }

}
