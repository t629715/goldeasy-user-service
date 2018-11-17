package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserInvoiceInfo;
import com.goldeasy.user.vo.UserInvoiceInfoVO;

import java.util.List;

public interface UserInvoiceInfoMapper extends BaseMapper<UserInvoiceInfo> {
    /**
     * fetch 获取用户的发票信息
     * @time: 2018/11/13
     * @param userId
     * @return
     */
    List<UserInvoiceInfoVO>  listUserInvoiceInfo(Long userId);
}