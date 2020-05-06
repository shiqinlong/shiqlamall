package com.shiqla.mall.product.dao;

import com.shiqla.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-06 22:53:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
