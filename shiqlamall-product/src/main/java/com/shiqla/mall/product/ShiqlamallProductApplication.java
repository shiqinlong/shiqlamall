package com.shiqla.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shiqla.mall.product.dao")
public class ShiqlamallProductApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ShiqlamallProductApplication.class, args);
    }

}
