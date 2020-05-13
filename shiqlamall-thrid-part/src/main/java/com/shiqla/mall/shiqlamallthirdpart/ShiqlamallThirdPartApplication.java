package com.shiqla.mall.shiqlamallthirdpart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShiqlamallThirdPartApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallThirdPartApplication.class, args);
    }

}
