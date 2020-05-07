package com.shiqla.mall.coupon.dao;

import com.shiqla.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:31:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
