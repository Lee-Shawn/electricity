package com.laughing.electricity.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laughing.common.utils.PageUtils;
import com.laughing.electricity.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 14:08:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

