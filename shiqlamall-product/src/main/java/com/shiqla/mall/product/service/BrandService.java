package com.shiqla.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:01:54
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

