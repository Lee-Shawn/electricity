package com.laughing.electricity.product.dao;

import com.laughing.electricity.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-17 22:59:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
