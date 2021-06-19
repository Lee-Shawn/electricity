package com.laughing.electricity.order.dao;

import com.laughing.electricity.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 14:26:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
