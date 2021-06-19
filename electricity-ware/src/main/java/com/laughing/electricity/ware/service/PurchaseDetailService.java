package com.laughing.electricity.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 14:36:42
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

