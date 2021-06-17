package com.laughing.electricity.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-17 22:59:07
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

