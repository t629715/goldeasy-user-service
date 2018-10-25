package com.goldeasy.user.service;

import com.goldeasy.user.dto.UserBankCardDTO;
import com.goldeasy.user.dto.UserLoginDTO;
import com.goldeasy.user.dto.UserRegisterDTO;
import com.goldeasy.user.vo.*;

import java.util.List;
import java.util.Map;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 17:11
 * @Description:用户银行卡业务接口
 **/
public interface UserBankCardService {

    /**
     * fetch 获取开户行列表信息
     * @author: tianliya
     * @time: 2018/10/25
     * @return
     */
    List<SysBankVO> listSysBank();

    /**
     * fetch 设置默认银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @param id
     * @return
     */
    Boolean setDefault(Long id);

    /**
     * fetch 绑定银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @param userBankCardDTO
     * @param userId
     * @return
     */
    Boolean addUserBankCard(UserBankCardDTO userBankCardDTO, Long userId);

    /**
     * fetch 删除银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @return
     */
    Boolean deleteUserBankCard(Long id);

    /**
     * fetch 获取用户的银行卡列表
     * @author: tianliya
     * @time: 2018/10/25
     * @param userId
     * @return
     */
    List<UserBankVO> listUserBank(Long userId);





}
