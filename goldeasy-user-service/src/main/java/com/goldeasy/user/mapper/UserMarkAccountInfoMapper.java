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
     * @param userId
     * @return
     */
    BigDecimal getMarkAmountById(Long userId);

    /**
     * fetch 修改前锁表-行级锁
     * @time: 2018/11/19
     * @param userId
     * @return
     */
    UserMarkAccountInfo lockForUpdate(Long userId);
}