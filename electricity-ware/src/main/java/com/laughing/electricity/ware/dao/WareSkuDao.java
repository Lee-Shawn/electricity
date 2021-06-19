package com.laughing.electricity.ware.dao;

import com.laughing.electricity.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 14:36:42
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
