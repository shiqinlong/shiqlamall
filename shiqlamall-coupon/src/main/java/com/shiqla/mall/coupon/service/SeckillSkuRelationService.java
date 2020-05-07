package com.shiqla.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:31:39
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

