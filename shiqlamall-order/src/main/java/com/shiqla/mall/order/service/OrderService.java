package com.shiqla.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:39:59
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

