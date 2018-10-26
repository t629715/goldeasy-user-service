package com.goldeasy.user.service;

import com.goldeasy.user.dto.UserBankCardDTO;
import com.goldeasy.user.entity.UserAlipay;
import com.goldeasy.user.vo.SysBankVO;
import com.goldeasy.user.vo.UserAlipayVO;
import com.goldeasy.user.vo.UserBankVO;

import java.util.List;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 17:11
 * @Description:用户支付宝业务接口
 **/
public interface UserAlipayService {

    /**
     * fetch 获取支付宝信息
     * @author: tianliya
     * @time: 2018/10/25
     * @param userId
     * @return
     */
    UserAlipayVO getUserAlipay(Long userId);

    /**
     * fetch 绑定支付宝
     * @author: tianliya
     * @time: 2018/10/25
     * @param userAlipay
     * @param userId
     * @return
     */
    Boolean bindUserAlipay(UserAlipay userAlipay, Long userId);

    /**
     * fetch 修改支付宝
     * @author: tianliya
     * @time: 2018/10/25
     * @return
     */
    Boolean modifyUserAlipay(UserAlipay userAlipay);






}
