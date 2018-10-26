package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserAlipay;
import com.goldeasy.user.vo.UserAlipayVO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAlipayMapper extends BaseMapper<UserAlipay> {
    /**
     * fetch 绑定支付宝
     * @author: tianliya
     * @time: 2018/10/26
     * @param userAlipay
     * @return
     */
    int bindAliPay(UserAlipay userAlipay);

    /**
     * fetch 获取用户绑定的支付宝
     * @author: tianliya
     * @time: 2018/10/26
     * @param userId
     * @return
     */
    UserAlipayVO getUserAliPayNum(Long userId);

    /**
     * fetch 修改绑定的支付宝
     * @author: tianliya
     * @time: 2018/10/26
     * @param userAlipay
     * @return
     */
    int updateAliPay(UserAlipay userAlipay);
}