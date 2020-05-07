package com.shiqla.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:01:53
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

