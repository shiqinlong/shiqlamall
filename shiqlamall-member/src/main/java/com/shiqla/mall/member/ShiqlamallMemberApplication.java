package com.shiqla.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.shiqla.mall.member.dao")
@EnableDiscoveryClient
// 扫描 声明式feign 接口包
@EnableFeignClients("com.shiqla.mall.member.feign")
public class ShiqlamallMemberApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallMemberApplication.class, args);
    }

}
