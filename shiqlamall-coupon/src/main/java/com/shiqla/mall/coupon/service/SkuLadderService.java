package com.shiqla.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:31:39
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

