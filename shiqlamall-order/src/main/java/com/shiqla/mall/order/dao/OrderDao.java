package com.shiqla.mall.order.dao;

import com.shiqla.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:39:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
