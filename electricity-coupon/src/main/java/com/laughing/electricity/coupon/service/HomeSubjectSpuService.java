package com.laughing.electricity.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 13:47:42
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

