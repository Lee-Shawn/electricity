package com.laughing.electricity.coupon.dao;

import com.laughing.electricity.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 13:47:42
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
