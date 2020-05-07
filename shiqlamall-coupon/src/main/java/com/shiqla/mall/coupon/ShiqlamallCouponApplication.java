package com.shiqla.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shiqla.mall.coupon.dao")
public class ShiqlamallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiqlamallCouponApplication.class, args);
	}

}
