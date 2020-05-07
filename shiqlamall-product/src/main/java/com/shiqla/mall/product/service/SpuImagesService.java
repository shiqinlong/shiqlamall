package com.shiqla.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:01:53
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

