package com.goldeasy.user.service;



import com.goldeasy.user.entity.UserInvoiceInfo;
import com.goldeasy.user.vo.UserInvoiceInfoVO;
import com.goldeasy.user.vo.UserMessageInfoVO;
import com.goldeasy.user.vo.UserMessageVO;

import java.util.List;

/**
 * @author:
 * @CreateTime:2018-10-15 17:11
 * @Description:用户发票相关业务接口
 **/
public interface UserInvoiceInfoService {
    /**
     * fetch 添加发票信息
     * @time: 2018/11/13
     * @param userInvoiceInfo
     * @param userId
     * @return
     */
    Boolean addUserInvoice(UserInvoiceInfo userInvoiceInfo, Long userId);

    /**
     * fetch 修改用户的发票信息
     * @time: 2018/11/13
     * @param userInvoiceInfo
     * @return
     */
    Boolean modifyUserInvoice(UserInvoiceInfo userInvoiceInfo);

    /**
     * fetch 获取用户的发票信息
     * @time: 2018/11/13
     * @param userId
     * @return
     */
    UserInvoiceInfoVO selectUserInvoiceInfo(Long userId);

    /**
     * fetch 获取用户的所有发票信息
     * @time: 2018/11/13
     * @param userId
     * @return
     */
    List<UserInvoiceInfoVO> listUserInvoiceInfo(Long userId);

}
