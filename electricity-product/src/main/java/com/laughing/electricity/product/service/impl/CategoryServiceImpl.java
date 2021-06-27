package com.laughing.electricity.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laughing.common.utils.PageUtils;
import com.laughing.common.utils.Query;

import com.laughing.electricity.product.dao.CategoryDao;
import com.laughing.electricity.product.entity.CategoryEntity;
import com.laughing.electricity.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 按照树形等级查询所有分类
     * @return 列表
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 查询所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 组装成父子关系的树形结构
        List<CategoryEntity> menus = entities.stream().filter((categoryEntity) ->
                // 过滤出一级列表
                categoryEntity.getParentCid() == 0
        ).map((menu) -> {
            // 设置子分类
            menu.setChildren(getChildren(menu, entities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());// 收集成List
        return menus;
    }

    /**
     * 递归获取子分类
     * @param root 当前分类
     * @param all 所有分类
     * @return 子分类集合
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            // 要查询的分类的父分类ID等于当前分类的ID，表明要查询的分类是当前分类的子分类
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            // 递归查询子分类
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            // 分类的排序
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}