package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.YgGoldRecoverOrder;
import org.springframework.stereotype.Repository;

/**
 * @author: tianliya
 * @time: 2018/10/24
 */
@Repository
public interface YgGoldRecoverOrderMapper extends BaseMapper<YgGoldRecoverOrder> {
    /**
     * fetch 获取用户的黄金回购预约的订单的数量
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId 用户id
     * @return
     */
    Integer getRecoverGoldAmountByUserId(Long userId);
}