package com.shiqla.mall.order.dao;

import com.shiqla.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:39:59
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
