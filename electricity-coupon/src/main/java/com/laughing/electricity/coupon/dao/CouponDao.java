package com.laughing.electricity.coupon.dao;

import com.laughing.electricity.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 13:47:42
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
