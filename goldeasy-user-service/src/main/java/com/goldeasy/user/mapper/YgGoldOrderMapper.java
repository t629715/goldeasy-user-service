package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.dto.OrderAmountDTO;
import com.goldeasy.user.entity.YgGoldOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface YgGoldOrderMapper extends BaseMapper<YgGoldOrder> {
    /**
     * fetch 根据状态获取已支付、待收货、已完成的订单的数量
     * @param userId 用户id
     * @author: tianliya
     * @time: 2018/10/24
     * @return Integer
     */
    OrderAmountDTO getOrderAmount(@Param("userId") Long userId);

    /**
     * fetch 获取用户的预约数量
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @return
     */
    Integer getPreOrderAmount(Long userId);

}