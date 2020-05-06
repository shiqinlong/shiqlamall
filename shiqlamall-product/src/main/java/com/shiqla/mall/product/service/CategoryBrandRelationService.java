package com.shiqla.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-06 22:53:50
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

