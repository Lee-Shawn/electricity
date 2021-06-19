package com.laughing.electricity.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 14:08:31
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

