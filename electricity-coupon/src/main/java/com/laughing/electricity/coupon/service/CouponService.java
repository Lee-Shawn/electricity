package com.laughing.electricity.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 13:47:42
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

