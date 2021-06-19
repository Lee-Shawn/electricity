package com.laughing.electricity.member.dao;

import com.laughing.electricity.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author laughing
 * @email slideryun@gmail.com
 * @date 2021-06-19 14:08:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
