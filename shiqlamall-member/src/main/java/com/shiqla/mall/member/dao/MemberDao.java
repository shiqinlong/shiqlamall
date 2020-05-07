package com.shiqla.mall.member.dao;

import com.shiqla.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:36:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
