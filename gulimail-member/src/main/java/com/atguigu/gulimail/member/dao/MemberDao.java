package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mashiro
 * @email 1016981796@qq.com
 * @date 2022-08-10 15:43:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
