package com.laughing.electricity.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-17 22:59:07
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

