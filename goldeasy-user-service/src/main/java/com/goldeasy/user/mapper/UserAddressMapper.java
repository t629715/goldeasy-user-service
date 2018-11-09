package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserAddress;
import com.goldeasy.user.vo.UserAddressVO;

import java.util.List;

public interface UserAddressMapper extends BaseMapper<UserAddress> {
    /**
     * fetch 获取用户的收货地址
     * @author: tianliya
     * @time: 2018/11/9
     * @param userId
     * @return
     */
    List<UserAddressVO> listUserAddress(Long userId);

    /**
     * fetch 获取用户默认的收货地址
     * @author:
     * @time: 2018/11/9
     * @param userId
     * @return
     */
    UserAddress selectDefaultAddress(Long userId);

 }