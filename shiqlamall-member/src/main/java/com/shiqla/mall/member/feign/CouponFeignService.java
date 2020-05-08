package com.shiqla.mall.member.feign;

import com.shiqla.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-08
 */

@FeignClient("shiqlamall-coupon")
public interface CouponFeignService
{

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupon();
}
