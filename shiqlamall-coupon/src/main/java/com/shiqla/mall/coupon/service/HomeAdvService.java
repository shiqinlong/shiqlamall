package com.shiqla.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:31:40
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

