package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserMarkAccountInfo;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author: tianliya
 * @time: 2018/10/22
 */
@Repository
public interface UserMarkAccountInfoMapper extends BaseMapper<UserMarkAccountInfo> {
    /**
     * fetch 根据id获取用户的积分
     * @author: tianliya
     * @time: 2018/10/23
     * @param id
     * @return
     */
    BigDecimal getMarkAmountById(Long id);
}