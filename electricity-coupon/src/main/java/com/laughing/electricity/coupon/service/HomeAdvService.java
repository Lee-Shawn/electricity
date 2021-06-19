package com.laughing.electricity.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 13:47:42
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

