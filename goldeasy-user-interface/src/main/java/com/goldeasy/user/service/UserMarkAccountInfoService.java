package com.goldeasy.user.service;

import com.goldeasy.user.dto.UserLoginDTO;
import com.goldeasy.user.dto.UserMarkDTO;
import com.goldeasy.user.dto.UserRealNameDTO;
import com.goldeasy.user.dto.UserRegisterDTO;
import com.goldeasy.user.vo.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author:
 * @CreateTime:2018-10-15 17:11
 * @Description:用户积分业务接口
 **/
public interface UserMarkAccountInfoService {
    /**
     * fetch 获取用户的积分信息
     * @time: 2018/11/19
     * @param userId
     * @return
     */
    UserMarkVO getUserMarkInfo(Long userId);

    /**
     * fetch 修改用户的积分余额
     * @time: 2018/11/19
     * @param userMarkDTO
     * @return
     */
    Boolean modifyUserMarkInfo(UserMarkDTO userMarkDTO);

    /**
     * fetch 获取用户的积分记录
     * @time: 2018/11/19
     * @param userId
     * @return
     */
    List<UserMarkRecordVO> listUserMarkRecord(Long userId);



}
