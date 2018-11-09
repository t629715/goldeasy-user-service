package com.goldeasy.user.service;


import com.goldeasy.user.entity.UserAddress;
import com.goldeasy.user.vo.UserAddressVO;

import java.util.List;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 17:11
 * @Description:用户地址相关业务接口
 **/
public interface UserAddressService {
    /**
     * fetch 用户添加联系地址
     * @author: tianliya
     * @time: 2018/11/9
     * @param userAddress
     * @param userId
     * @return
     */
    Boolean addUserAddress(UserAddress userAddress, Long userId);

    /**
     * fetch 删除选中的地址
     * @author: tianliya
     * @time: 2018/11/9
     * @param id
     * @return
     */
    Boolean deleteUserAddressById(Long id);

    /**
     * fetch 修改选中的地址信息
     * @author: tianliya
     * @time: 2018/11/9
     * @param userAddress
     * @return
     */
    Boolean modifyUserAddressById(UserAddress userAddress);

    /**
     * fetch 修改默认收货地址
     * @author:
     * @time: 2018/11/9
     * @param id
     * @param userId
     * @return
     */
    Boolean setDefaultAddress(Long id, Long userId);

    /**
     * fetch 获取用户的所有的地址信息
     * @author: tianliya
     * @time: 2018/11/9
     * @param userId
     * @return
     */
    List<UserAddressVO> listUserAddress(Long userId);



}
