package com.shiqla.mall.shiqlamallgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class ShiqlamallGatewayApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallGatewayApplication.class, args);
    }

}
