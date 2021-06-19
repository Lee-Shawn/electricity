package com.laughing.electricity.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 13:47:42
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

