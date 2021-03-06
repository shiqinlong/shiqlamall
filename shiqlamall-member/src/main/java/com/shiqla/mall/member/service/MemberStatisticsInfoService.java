package com.shiqla.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiqla.common.utils.PageUtils;
import com.shiqla.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author shiqla
 * @email shiqla@qq.com
 * @date 2020-05-07 11:36:51
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage (Map<String, Object> params);
}

