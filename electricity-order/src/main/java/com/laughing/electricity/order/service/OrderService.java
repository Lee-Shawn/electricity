package com.laughing.electricity.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 14:26:47
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

