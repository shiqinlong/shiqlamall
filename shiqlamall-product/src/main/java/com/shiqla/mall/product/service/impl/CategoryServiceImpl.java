package com.shiqla.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.common.utils.Query;

import com.shiqla.mall.product.dao.CategoryDao;
import com.shiqla.mall.product.entity.CategoryEntity;
import com.shiqla.mall.product.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity>
    implements CategoryService
{

    @Override
    public PageUtils queryPage (Map<String, Object> params)
    {
        IPage<CategoryEntity> page = this.page(
            new Query<CategoryEntity>().getPage(params),
            new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree ()
    {
        List<CategoryEntity> categoryEntities = this.baseMapper.selectList(null);
        List<CategoryEntity> level1List = categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getParentCid() == 0
        ).map(menu -> {
            menu.setChildren(getChildren(menu, categoryEntities));
            return menu;
        }).collect(Collectors.toList());

        return level1List;
    }

    private List<CategoryEntity> getChildren (CategoryEntity menu,
                                              List<CategoryEntity> entityList)
    {

        // to do..
        return null;
    }
}